package SKK_Day08;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the sum of the two elements of a given array equal to a given integer

		int i, target = 6;  // target to check sum
		int[] myarr1 = { 1, 2, 4, 5, 6 };

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();
		checkSum(myarr1, target);

	}

	public static void checkSum(int[] arr, int target) {
		int i, j;

		for (i = 0; i < arr.length; i++) { // sort - ascending order
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
