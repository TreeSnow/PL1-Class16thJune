package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Insert an element to specific position
		
		int i, j, row, col, searchRow, searchCol, insertNum;
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
		
		System.out.println("Please give me the row number of array to reach out :");
		searchRow = kb.nextInt();
		System.out.println("Please give me the column number of array to reach out :");
		searchCol = kb.nextInt();
		System.out.println("Please give me a number to insert :");
		insertNum = kb.nextInt();

		insertArr(myarr, searchRow, searchCol, insertNum);
		
		System.out.println("============================ ");
		System.out.println("Printing the array - after insert the value");
		System.out.println("============================ ");
		for (i = 0; i < myarr.length; i++) {
			for (j = 0; j < myarr[i].length; j++) {
				System.out.printf("%4d", myarr[i][j]);
			}
			System.out.println();
		}
		
		kb.close();
	}
	
	public static void insertArr(int[][] arr , int row, int col, int rep) {
		arr[row][col] = rep;

	}
	

}
