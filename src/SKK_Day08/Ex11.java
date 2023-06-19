package SKK_Day08;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find common elements between two arrays (String)

		int i;
		String str1, str2;
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Please Input a string to create the first array : ");
			str1 = kb.next();
			char[] myarr1 = new char[str1.length()];
			for (i = 0; i < myarr1.length; i++) {
				myarr1[i] = str1.charAt(i);
			}

			System.out.println("Please Input a string to create the second array : ");
			str2 = kb.next();
			char[] myarr2 = new char[str2.length()];
			for (i = 0; i < myarr2.length; i++) {
				myarr2[i] = str2.charAt(i);
			}
			

			System.out.println("============================ ");
			System.out.println("Printing the first array ");
			System.out.println("============================ ");
			for (i = 0; i < myarr1.length; i++) {
				System.out.printf("%3s", myarr1[i]);
			}

			System.out.println();
			System.out.println("============================ ");
			System.out.println("Printing the second array ");
			System.out.println("============================ ");
			for (i = 0; i < myarr2.length; i++) {
				System.out.printf("%3s", myarr2[i]);
			}

			System.out.println();

			compArr(myarr1, myarr2);
			kb.close();
		}

	}

	public static void compArr(char[] arr1, char[] arr2) {
		int i, j, count = 0;
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("Value '" + arr1[i] + "' at the index [" + i
							+ "] of the first Array is same with the index [" + j + "] of the second Array");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("There is no common value between arrays!!");
		}
	}
}
