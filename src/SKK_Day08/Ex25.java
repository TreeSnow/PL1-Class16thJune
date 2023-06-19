package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check if an array contains two specified elements (65 and 77)

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
			myarr1[i] = rand.nextInt(65, 80); // random 65 to 80
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		check_Num(myarr1);
	}

	public static void check_Num(int[] arr) {
		int i, ck1 = 65, ck2 = 77;

		for (i = 0; i < arr.length; i++) { // filtering 65, 77
			if (arr[i] == ck1 || arr[i] == ck2) {
				System.out.println("index [" + i + "] : " + arr[i]);
			} else {
				continue;
			}
		}
	}

}
