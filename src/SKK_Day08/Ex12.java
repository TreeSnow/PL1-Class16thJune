package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find common elements between two arrays (integers)
		
		int i, sz1, sz2;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size of the first array to creat : ");
		sz1 = kb.nextInt();
		System.out.println("Please Input the size of the second array to creat : ");
		sz2 = kb.nextInt();
		kb.close();
	

		int[] myarr1 = new int[sz1];
		int[] myarr2 = new int[sz2];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(10);
		}
		for (i = 0; i < myarr2.length; i++) {
			myarr2[i] = rand.nextInt(10);
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
		
		compArr(myarr1, myarr2);

//		kb.close();
	}
	
	public static void compArr(int[] arr1, int[] arr2) {
		int i, j, count = 0;
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("Value '" + arr1[i] + "' at the index [" + i
							+ "] of the first Array is same with the index [" + j + "] of the second Array");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There is no common value between arrays!!");
		}
	}
}
