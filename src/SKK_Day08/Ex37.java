package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Separate and sort  Even and Odd

		int i, sz;

		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size of array to creat  : ");
		sz = kb.nextInt();
		kb.close();

		int[] myarr1 = new int[sz];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(10);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		orderEvenOdd(myarr1);

		System.out.println("============================ ");
		System.out.println("Printing the array - After reorder Even and Odd ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

	}

	public static void orderEvenOdd(int[] arr) {
		int i, j, temp;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}
}
