package SKK_Day08;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check longest sequence
		int i, res;
		int[] myarr1 = { 49, 1, 3, 200, 2, 4, 70, 5 };

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		res = longConsecutive(myarr1);

		System.out.println("Longest sequence : " + res);

	}

	public static int longConsecutive(int[] arr) {
		int i, j, temp, cnt = 1, cntComp = 1;
		for (i = 0; i < arr.length; i++) { // sort - ascending order
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (i = 0; i < arr.length - 1; i++) {
			if (i == 0) {
				if (arr[i] - arr[i + 1] == -1) {
					cnt++;
				} else {
					continue;
				}
			} else {
				if (arr[i] - arr[i + 1] == -1) {
					cnt++;
				} else {
					if (cnt >= cntComp) {
						cntComp = cnt;
						cnt = 1;
					} else {
						continue;
					}
				}
			}
		}

		System.out.println("============================ ");
		System.out.println("Printing the array sorted ");
		System.out.println("============================ ");
		for (i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();

		return cntComp;
	}

}
