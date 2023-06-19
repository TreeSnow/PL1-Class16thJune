package SKK_Day08;

//import java.util.Random;
//import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sort Max & Min in descending order (1st Max, 1st Min, 2nd Max, 2nd Min ....)

		int i;

//		Scanner kb = new Scanner(System.in);
//		Random rand = new Random();
//		System.out.println("Please Input the size of array to creat  : ");
//		sz = kb.nextInt();
//		kb.close();

//		int[] myarr1 = new int[sz];
//
//		for (i = 0; i < myarr1.length; i++) {
//			myarr1[i] = rand.nextInt(-3, 3);
//		}
		
		int[] myarr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();

		orderMaxMin(myarr2);

		System.out.println("============================ ");
		System.out.println("Printing the array - After reorder (repeated Max-Min) ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();

	}

	public static void orderMaxMin(int[] arr) {
		int i, j, temp;
		int[] maxArr = new int[arr.length / 2];
		int[] minArr = new int[arr.length / 2];

		for (i = 0; i < arr.length; i++) { // sort descending order
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (i = 0; i < arr.length; i++) {  // separate Max/ Min
			j = minArr.length - i + 3;
			if (i < minArr.length) {
				maxArr[i] = arr[i];
			} else {
				minArr[j] = arr[i];
			}
		}

		for (i = 0, j = 0; i < arr.length; i++, j++) { // merge Max/ Min
			if (i < maxArr.length) {
				if (i % 2 == 0) {
					arr[i] = maxArr[j--];
				} else {
					arr[i] = minArr[j];
				}

			} else {
				j = i / 2;
				if (i % 2 == 0) {
					arr[i] = maxArr[j--];
				} else {
					arr[i] = minArr[j];
				}
			}
		}

	}
}
