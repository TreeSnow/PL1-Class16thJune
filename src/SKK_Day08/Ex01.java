package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Avg of array elements

		int sz, i;

		Random rand = new Random();
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Input the size of array : ");
			sz = kb.nextInt();
			int[] myarr = new int[sz];
			for (i = 0; i < myarr.length; i++) {
				myarr[i] = rand.nextInt(10);
			}

			System.out.println("============================ ");
			System.out.println("Printing the array ");
			System.out.println("============================ ");
			for (i = 0; i < myarr.length; i++) {
				System.out.printf("%4d", myarr[i]);
			}

			System.out.println();
			System.out.printf("Average value of the array elements is : %.2f ", calAvg(myarr));

			kb.close();
		}

	}

	public static double calAvg(int[] arr) {
		int sum = 0;
		double avg;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		return avg;
	}

}
