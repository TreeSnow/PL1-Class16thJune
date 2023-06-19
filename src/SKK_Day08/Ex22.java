package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Avg except Max & Min

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

		avg_Mids(myarr1);

	}

	public static void avg_Mids(int[] arr) {
		int i, j, k = 0, temp, max, min, cnt = 0, sum = 0, avg;
		int[] avgArr = new int[arr.length];

		for (i = 0; i < arr.length; i++) { // descending Order
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
		max = arr[0];
		min = arr[arr.length - 1];

		for (i = 0; i < arr.length; i++) {
			if (arr[i] != max) {
				if (arr[i] != min) {
					avgArr[k++] = arr[i];
					cnt++;
				}
			} else if (arr[i] != min) {
				avgArr[k++] = arr[i];
				cnt++;
			} else {
				continue;
			}

		}

		for (i = 0; i < cnt; i++) {
			sum += avgArr[i];
		}

		avg = sum / cnt;

		System.out.println();
		System.out.printf("Avg of mid numbers : %d", avg);

	}

}
