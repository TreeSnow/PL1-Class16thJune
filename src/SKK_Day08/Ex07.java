package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Max and Min
		
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

		is_MaxMin(myarr);

		kb.close();
	}

	public static void is_MaxMin(int[][] arr) {
		int i, j, max, min;
		max = arr[0][0];
		min = arr[0][0];

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				} else {
					continue;
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				} else {
					continue;
				}
			}
		}

		System.out.println("Maximum value of the array : " + max);
		System.out.println("Minimum value of the array : " + min);

	}
}
