package SKK_Day08;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find duplicate values in a string value array

		int i;
		String str;
		Scanner kb = new Scanner(System.in);

		System.out.println("Please Input a string to create an array : ");
		str = kb.next();
		kb.close();
		
		char[] myarr = new char[str.length()];
		for (i = 0; i < myarr.length; i++) {
			myarr[i] = str.charAt(i);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr.length; i++) {
			System.out.printf("%3s", myarr[i]);
		}

		System.out.println();

		checkDup(myarr);

	}

	public static void checkDup(char[] arr) {

		int i, j, count = 0;

		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(
							"Value '" + arr[i] + "' of index [" + i + "] is duplicated at the index [" + j + "]");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There is no duplication of the value in this array!!");
		}

	}

}
