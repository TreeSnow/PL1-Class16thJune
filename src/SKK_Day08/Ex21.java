package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Difference between largest and smallest

		int i, sz;

		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		do {
			System.out.println("Please Input the size of array to creat  : ");
			sz = kb.nextInt();
			if (sz <= 1) {
				System.out.println("Invalid size. Please Input bigger size : ");
			}
		} while (sz <= 1);

		kb.close();

		int[] myarr1 = new int[sz];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(10);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();
		
		diff_MaxMin(myarr1);
		
//		System.out.println();
//		System.out.println("Maximum value : " + myarr1[0]);
//		System.out.println("Minimum value : " + myarr1[myarr1.length-1]);
//		System.out.println("++++++++++++++++++++++++++++++++++");
//		System.out.println("Difference (Max - Min) : " + (myarr1[0] - myarr1[myarr1.length-1]));
			

	}
	
	public static void diff_MaxMin(int[] arr) {
		int i, j, temp;
		for (i = 0; i < arr.length; i++) {  // descending Order
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} else {
					continue;
				}
			}
		}
		System.out.println();
		System.out.println("Maximum value : " + arr[0]);
		System.out.println("Minimum value : " + arr[arr.length-1]);
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("Difference (Max - Min) : " + (arr[0] - arr[arr.length-1]));

	}

}
