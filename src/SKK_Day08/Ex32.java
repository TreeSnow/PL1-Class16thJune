package SKK_Day08;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find rotation of sorted array
		
		int i, rotCnt = 0;

//		Random rand = new Random();
//		Scanner kb = new Scanner(System.in);
//		System.out.println("Input the size of array : ");
//		sz = kb.nextInt();
//		kb.close();
//		int[] myarr = new int[sz];
//		for (i = 0; i < myarr.length; i++) {
//			myarr[i] = rand.nextInt(10);
//		}
		int[] myarr1 = { 1, 2, 3, 4, 5 };
		int[] myarr2 = { 4, 5, 1, 2, 3 };

		System.out.println("============================ ");
		System.out.println("Printing the original array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		System.out.println("============================ ");
		System.out.println("Printing the array to compare ");
		System.out.println("============================ ");
		for (i = 0; i < myarr2.length; i++) {
			System.out.printf("%4d", myarr2[i]);
		}
		System.out.println();

		rotCnt = countRot(myarr1, myarr2);

		System.out.println("Rotation Count to be matched : " + rotCnt);

	}

	public static int countRot(int[] orgArr, int[] compArr) {
		int i, temp, rotCnt = 0, match = 0, unmatch = 0;

		do {
			for (i = 0; i < compArr.length; i++) {
				if (compArr[i] != orgArr[i]) {
					unmatch++;
					break;
				} else {
					continue;
				}
			}

			if (unmatch == 0) {
				match = 1;
			} else {
				temp = compArr[compArr.length - 1];
				for (i = compArr.length - 1; i > 0; i--) {
					compArr[i] = compArr[i - 1];
				}
				compArr[0] = temp;
				rotCnt++;
			}
			unmatch = 0;

		} while (match == 0);

		return rotCnt;

	}

}
