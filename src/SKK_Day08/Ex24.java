package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check if sum of 10's numbers

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
			myarr1[i] = rand.nextInt(100);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		boolean bl = check_NumTens(myarr1);
		System.out.println("Check if the Sum of 10's numbers are 30 : " + bl);

	}

	public static boolean check_NumTens(int[] arr) {
		int i, k = 0, sum = 0;
		int[] checkArr = new int[arr.length];

		for (i = 0; i < arr.length; i++) { // filtering 10's
			if (arr[i] / 10 != 0) {
				checkArr[k++] = arr[i] /10;
			}
		}

		for (i = 0; i < checkArr.length; i++) { 
			sum += checkArr[i];
		}
		System.out.println("Sum of 10's numbers : " + sum);
		if (sum == 30) {
			return true;
		} else {
			return false;
		}
	}

}
