package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check if an array of integers is without 0 and -1
		int i, sz;

		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		do {
			System.out.println("Please Input the size of array to creat  : ");
			sz = kb.nextInt();
			if (sz <= 1) {
				System.out.println("Invalid size. Please Input bigger size : ");
			}
		} while (sz <= 1);

		kb.close();

		int[] myarr1 = new int[sz];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(-1, sz);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		boolean bl = checkNum(myarr1);
		if (bl) {
			System.out.println("OK!! : Array does not include 0 nor -1 !");
		} else {
			System.out.println("NG!! : Array includes 0 or -1 !");
		}

	}

	public static boolean checkNum(int[] arr) {
		int i;

		for (i = 0; i < arr.length; i++) { // filtering 0 or -1
			if (arr[i] != 0) {
				if (arr[i] == -1) {
					return false;
				} else {
					continue;
				}
			} else {
				return false;
			}
		}
		return true;
	}

}
