package SKK_Day08;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find all combination of four elements of an array whose sum is equal to a given value

		int i, target = 7; // target value to check sum

		int[] myarr1 = { 7, 9, 2, 5, 3, 4 };

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		checkCombination(myarr1, target);

	}

	public static void checkCombination(int[] arr, int target) {
		int i, j;

		for (i = 0; i < arr.length; i++) { 
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < target && arr[j] < target) {
					if (arr[i] + arr[j] == target) {
						System.out.println("Element found!");
						System.out.printf("Sum of %d and %d : %d %n", arr[i], arr[j], target);
					} else {
						continue;
					}
				} else {
					continue;
				}

			}
		}
	}

}
