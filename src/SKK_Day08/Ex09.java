package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find duplicate values

		int i, j, row, col;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the row number of array to creat : ");
		row = kb.nextInt();
		System.out.println("Please Input the column number of array to creat : ");
		col = kb.nextInt();

		int[][] myarr = new int[row][col];

		for (i = 0; i < myarr.length; i++) {
			for (j = 0; j < myarr[i].length; j++) {
				myarr[i][j] = rand.nextInt(100);
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

		checkDup(myarr);

		kb.close();

	}

	public static void checkDup(int[][] arr) {

		int i, j, k, row, count = 0;

		for (i = 0; i < arr.length; i++) {
			row = i;
			for (j = 0; j < arr[i].length; j++) {

				for (k = j + 1; k < arr[i].length; k++) {
					if (arr[row][j] == arr[i][k]) {
						System.out.println("Value " + arr[row][j] + " of index [" + row + "][" + j
								+ "] is duplicated at the index [" + i + "][" + k + "]");
						count++;
					}

				}
				if (j == arr[i].length - 1 && i != arr.length - 1) {
					j = -1;
					i++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There is no duplication of the value in this array!!");
		}
	}

}
