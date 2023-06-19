package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// All 0's to the end of an array

		int i, sz;

		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size of array to creat  : ");
		sz = kb.nextInt();
		kb.close();

		int[] myarr1 = new int[sz];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(3);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		orderZero(myarr1);

		System.out.println("============================ ");
		System.out.println("Printing the array - After reorder '0'(s) ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

//		kb.close();

	}

	public static void orderZero(int[] arr) {
		int i, j, temp;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == 0 && arr[j] != 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
