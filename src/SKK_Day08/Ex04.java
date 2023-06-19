package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static int CNT = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Remove a specific element

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
		System.out.println("Please Input the value to remove from the array : ");
		chVal = kb.nextInt();
		myarr = remove_Element(myarr, chVal);

		if(CNT >0) {
			System.out.println("============================ ");
			System.out.println("After removing vlaue - Array printing");
			System.out.println("============================ ");
			for (i = 0; i < myarr.length; i++) {
				for (j = 0; j < myarr[i].length; j++) {
					System.out.printf("%4d", myarr[i][j]);
				}
				System.out.println();
			}
		}
		
		kb.close();

	}

	public static int[][] remove_Element(int[][] arr, int target) {
		int i, j, cnt = 0;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					System.out.println("Value is removed from the index [" + i + "][" + j + "]");
					arr[i][j] = 0;
					cnt++;
				} else {
					continue;
				}
			}
		}
		if (cnt == 0) {
			System.out.println("Value is Not found from the array!!");
			return arr;
		} else {
			CNT = cnt;
			return arr;
		}

	}

}
