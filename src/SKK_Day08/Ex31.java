package SKK_Day08;

//import java.util.Random;
//import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cyclic rotate  a given array  clockwise by one

		int i;

//		Random rand = new Random();  
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Input the size of array : ");
//		sz = kb.nextInt();
//		kb.close();
//		int[] myarr = new int[sz];
//		for (i = 0; i < myarr.length; i++) {
//			myarr[i] = rand.nextInt(10);
//		}
		int[] myarr = { 1, 2, 3, 4, 5 };
		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr.length; i++) {
			System.out.printf("%4d", myarr[i]);
		}
		System.out.println();
		
		rotateArr(myarr);
		
		System.out.println("============================ ");
		System.out.println("Printing the array : rotated ");
		System.out.println("============================ ");
		for (i = 0; i < myarr.length; i++) {
			System.out.printf("%4d", myarr[i]);
		}
		System.out.println();

	}

	public static void rotateArr(int[] arr) {
		int i, temp;
		temp = arr[arr.length - 1];

		for (i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

	}

}
