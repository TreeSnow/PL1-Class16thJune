package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test equality of two arrays
		
		int i, j, row, col;
		boolean bl;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the row number of array to creat : ");
		row = kb.nextInt();
		System.out.println("Please Input the column number of array to creat : ");
		col = kb.nextInt();

		int[][] myarr1 = new int[row][col];
		int[][] myarr2 = new int[row][col];

		for (i = 0; i < myarr1.length; i++) {
			for (j = 0; j < myarr1[i].length; j++) {
				myarr1[i][j] = rand.nextInt(2);
			}
		}
		for (i = 0; i < myarr2.length; i++) {
			for (j = 0; j < myarr2[i].length; j++) {
				myarr2[i][j] = rand.nextInt(2);
			}
		}

		System.out.println("============================ ");
		System.out.println("Printing the first array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			for (j = 0; j < myarr1[i].length; j++) {
				System.out.printf("%4d", myarr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("============================ ");
		System.out.println("Printing the second array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			for (j = 0; j < myarr2[i].length; j++) {
				System.out.printf("%4d", myarr2[i][j]);
			}
			System.out.println();
		}

		bl = checkEq(myarr1, myarr2);

		if (bl) {
			System.out.println("Two arrays are equal!!");
		} else {
			System.out.println("Two arrays are different!!");
		}

		kb.close();

	}

	public static boolean checkEq(int[][] arr1, int[][] arr2) {
		int i, j;

		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] != arr2[i][j]) {
					return false;
				}
			}
		}

		return true;
	}

}
