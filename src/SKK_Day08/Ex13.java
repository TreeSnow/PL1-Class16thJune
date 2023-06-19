package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// compare two arrays and remove duplication(s)
		int i, sz1, sz2;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size of the first array to creat : ");
		sz1 = kb.nextInt();
		System.out.println("Please Input the size of the second array to creat");
		sz2 = kb.nextInt();
		kb.close();

		int[] myarr1 = new int[sz1];
		int[] myarr2 = new int[sz2];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(1, 10);
		}
		for (i = 0; i < myarr2.length; i++) {
			myarr2[i] = rand.nextInt(1, 10);
		}

		System.out.println("============================ ");
		System.out.println("Printing the first array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		System.out.println("============================ ");
		System.out.println("Printing the second array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();

		removeDup(myarr1, myarr2);

		System.out.println();
		System.out.println("============================ ");
		System.out.println("After removing duplication : first array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		System.out.println("============================ ");
		System.out.println("After removing duplication : second array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();

//		kb.close();
	}

	public static void removeDup(int[] arr1, int[] arr2) {
		int i, j, k, temp, count = 0;
		for (i = 0; i < arr1.length; i++) {
			temp = arr1[i];
			if(temp == 0) {
				continue;
			}
			for (j = 0; j < arr2.length; j++) { // compare with other array
				if (temp == arr2[j]) {
					arr1[i] = arr2[j] = 0;
					count++;
				}
			}
			for (k = 0; k < arr1.length; k++) {   // compare with itself
				if (temp == arr1[k] && count >=1) {
					arr1[k] = 0;
					count++;
				}
			}
			if (count >= 1 && j == arr2.length) {
				System.out.println(">> Duplicated Value " + temp + " will be replaced with '0'");
				count = 0;
			}
		}

	}

}
