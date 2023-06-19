package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// copy an array 
		
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

		int[][] myarr2 = new int[row][col];
		myarr2 = copyArr(myarr);

		System.out.println("============================ ");
		System.out.println("Printing the cloned array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			for (j = 0; j < myarr2[i].length; j++) {
				System.out.printf("%4d", myarr2[i][j]);
			}
			System.out.println();
		}

		kb.close();
	}

	public static int[][] copyArr(int[][] arr) {
		int i, j, row, col;

		row = arr.length;
		col = arr[0].length;

		int cloneArr[][] = new int[row][col];
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				cloneArr[i][j] = arr[i][j];
			}
		}

		return cloneArr;

	}

}
