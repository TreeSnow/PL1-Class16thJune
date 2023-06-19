package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row, col, chVal;
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
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr.length; i++) {
			for (j = 0; j < myarr[i].length; j++) {
				System.out.printf("%4d", myarr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Please Input the value to check where it is in the array : ");
		chVal = kb.nextInt();
		findArr(myarr, chVal);

		kb.close();

	}

	public static void findArr(int[][] arr, int searchNum) {
		int i, j, count = 0;

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (arr[i][j] == searchNum) {
					System.out.println("Value is found at the index [" + i + "][" + j + "]");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Value is not found from this array!!");
		}else {
			System.out.println("Done!!");
		}
	}

}
