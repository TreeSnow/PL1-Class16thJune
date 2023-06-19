package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find missing number in an array 
		int i, sz, count = 0;

		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size of array to creat  : ");
		sz = kb.nextInt();
		kb.close();

		int[] myarr1 = new int[sz];
		int[] myarr2 = new int[sz];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(1, sz);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		myarr2 = checkMissing(myarr1, sz);

		System.out.println(">> Missing number(s) - between 1 and " + sz);
		for (i = 0; i < myarr2.length; i++) {
			if (myarr2[i] != 0) {
				System.out.printf("%4d", myarr2[i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.print("There is no missing number!");
		}

//		kb.close();

	}

	public static int[] checkMissing(int[] arr, int checkMax) {
		int i, j, check = 1, count = 0, ind = 0;
		int[] checkArr = new int[checkMax];

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (check == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				checkArr[ind++] = check;

			} else {
				count = 0;
				ind++;
			}
			check++;
			if (check < checkMax && i == arr.length - 1) {
				i = -1;
			}
		}
		return checkArr;
	}
}
