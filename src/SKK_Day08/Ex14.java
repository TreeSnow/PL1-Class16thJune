package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find second largest element in an array

		int i, sz1, second;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size to creat an array : ");
		sz1 = kb.nextInt();

		int[] myarr1 = new int[sz1];
		kb.close();

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(1, 10);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		second = secondLargest(myarr1);

		System.out.println("Second largest element : " + second);

//		kb.close();

	}

	public static int secondLargest(int[] arr) {
		int i, j, temp;
		for (i = 0; i < arr.length; i++) {
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
		for (i = 0; i < arr.length; i++) {
			temp = arr[i];
			for (j = i + 1; j < arr.length; j++) {
				if (temp > arr[j]) {
					return arr[j];
				}

			}

		}
		return arr[0];

	}

}
