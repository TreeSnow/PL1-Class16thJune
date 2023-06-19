package SKK_Day08;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Remove duplication(s) and resize the array

		int i;
		int[] myarr1 = { 20, 20, 30, 40, 50, 50, 50 };

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		int[] myarr2 = filterArr(myarr1);

		System.out.println("============================ ");
		System.out.println("Printing the return array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();
	}

	public static int[] filterArr(int[] arr) {
		int i, j, k = 0, m, dupCnt = 0;
		int[] chkArr = new int[arr.length];

		for (i = 0; i < arr.length; i++) { // remove duplicates
			for (m = i + 1; m < arr.length; m++) {
				if (arr[i] == arr[m]) {
					dupCnt++;
				}
			}
			if (dupCnt == 0) {
				chkArr[k++] = arr[i];
			} else {
				i++; // filtering duplicated element from counts
				for (j = i + 1; j < arr.length; j++) {
					if (dupCnt == 1 && j == arr.length - 1) {
						chkArr[k++] = arr[i];
					} else if (arr[i] == arr[j]) {
						dupCnt++;
					} else {
						continue;
					}
				}
			}
			dupCnt = 0;
		}

		int[] resArr = new int[k];
		for (i = 0; i < resArr.length; i++) {
			resArr[i] = chkArr[i];
		}

		return resArr;
	}

}
