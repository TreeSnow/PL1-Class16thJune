package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Even and Odd numbers

		int i, sz;

		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size of array to creat  : ");
		sz = kb.nextInt();
		kb.close();

		int[] myarr1 = new int[sz];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(5);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		is_EvenOdd(myarr1);

//		kb.close();

	}

	public static void is_EvenOdd(int[] arr) {
		int i, j = 0, k = 0, evenCnt = 0, oddCnt = 0;
		int[] evenArr = new int[arr.length];
		int[] oddArr = new int[arr.length];

		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[j++] = arr[i];
				evenCnt++;
			} else {
				oddArr[k++] = arr[i];
				oddCnt++;
			}
		}
		System.out.println();
		System.out.print("Even number(s) : ");
		for (i = 0; i < evenCnt; i++) {
			System.out.printf("%3d", evenArr[i]);
		}

		System.out.println();
		System.out.print("Odd number(s) : ");
		for (i = 0; i < oddCnt; i++) {
			System.out.printf("%3d", oddArr[i]);
		}

	}

}
