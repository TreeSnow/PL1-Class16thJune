package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse an array of integer values
		
		int i, j, sz;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Please Input the size of array to create N x N array : ");
		sz = kb.nextInt();

		int[][] myarr = new int[sz][sz];

		for (i = 0; i < myarr.length; i++) {
			for (j = 0; j < myarr[i].length; j++) {
				myarr[i][j] = rand.nextInt(4);
			}
		}

		System.out.println("============================ ");
		System.out.println("Printing the original array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr.length; i++) {
			for (j = 0; j < myarr[i].length; j++) {
				System.out.printf("%4d", myarr[i][j]);
			}
			System.out.println();
		}

		int[][] revArr = new int[sz][sz];
		revArr = reverseArr(myarr);

		System.out.println("============================ ");
		System.out.println("Printing the reversed array");
		System.out.println("============================ ");
		for (i = 0; i < revArr.length; i++) {
			for (j = 0; j < revArr[i].length; j++) {
				System.out.printf("%4d", revArr[i][j]);
			}
			System.out.println();
		}

		kb.close();

	}

	public static int[][] reverseArr(int[][] arr) {
		int i, j, row, col;
		row = arr.length;
		col = arr[0].length;

		int revArr[][] = new int[row][col];
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				revArr[i][j] = arr[j][i];
			}
		}

		return revArr;
	}

}
