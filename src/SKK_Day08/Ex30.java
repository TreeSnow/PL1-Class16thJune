package SKK_Day08;

import java.util.Random;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Count possible triangles
		
		int i, sz1, cntTriangle;
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size to creat an array : ");
		sz1 = kb.nextInt();

		int[] myarr1 = new int[sz1];
		kb.close();

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(1, 20);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		cntTriangle = is_Triangle(myarr1);
		System.out.println("Number of possible Triangle : " + cntTriangle);

	}

	public static int is_Triangle(int[] arr) {
		int i, j, k, cntValid = 0;

		for (i = 0; i < arr.length - 2; i++) { // check triangle validity
			for (j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] >= arr[j + 1]) {
					cntValid++;

					System.out.println(arr[i] + " + " + arr[j] + " >= " + arr[j + 1]);
				} else {
					System.out.println(arr[i] + " + " + arr[j] + " < " + arr[j + 1]);
					continue;
				}
			}
			for (k = arr.length - 1; k > i + 1; k--) {
				if (arr[i] + arr[k] >= arr[k - 1]) {
					cntValid++;

					System.out.println(arr[i] + " + " + arr[k] + " >= " + arr[k - 1]);
				} else {
					System.out.println(arr[i] + " + " + arr[k] + " < " + arr[k - 1]);
					continue;
				}
			}
		}

		for (i = arr.length - 1; i > 1; i--) {
			for (j = i - 1; j > 0; j--) {
				if (arr[i] + arr[j] >= arr[j - 1]) {
					cntValid++;
					System.out.println(arr[i] + " + " + arr[j] + " >= " + arr[j - 1]);
				} else {
					System.out.println(arr[i] + " + " + arr[j] + " < " + arr[j - 1]);
					continue;
				}
			}
			for (k = 0; k < arr.length - 3; k++) {
				if (arr[i] + arr[k] >= arr[k + 1]) {
					cntValid++;
					
					System.out.println(arr[i] + " + " + arr[k] + " >= " + arr[k + 1]);
				} else {
					System.out.println(arr[i] + " + " + arr[k] + " < " + arr[k + 1]);
					continue;
				}
			}
		}

		return cntValid;
	}

}
