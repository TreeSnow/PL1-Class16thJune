package SKK_Day08;

//import java.util.Random;
//import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Replace every element with the next greatest element
		
		int i;

//		Scanner kb = new Scanner(System.in);
//		Random rand = new Random();
//		System.out.println("Please Input the size of array to creat  : ");
//		sz = kb.nextInt();
//		kb.close();
//
//		int[] myarr1 = new int[sz];
//
//		for (i = 0; i < myarr1.length; i++) {
//			myarr1[i] = rand.nextInt(10);
//		}

		int[] myarr2 = { 10, 9, 2, 5, 8, 4, 1, 2, 6, 3, 7 };

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();

		replace_NextGreatest(myarr2);

		System.out.println("============================ ");
		System.out.println("Printing the array - After replace with the next greatest ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();

	}

	public static void replace_NextGreatest(int[] arr) {
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length - 1; j++) {
				if (arr[i + 1] < arr[j + 1]) {
					arr[i + 1] = arr[j + 1];
				} else {
					continue;
				}
			}
			if (i == arr.length - 1) {
				arr[i] = -1;
			} else {
				continue;
			}

		}

	}

}
