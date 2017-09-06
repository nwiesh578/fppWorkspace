package Lesson1;

public class childprob {
public static void main(String[] args) {

		int r1, r2, r3, r4, i;

		int up = 99;

		int low = 1;

		int[][] mArray = new int[4][4];

		for(i = 0; i<mArray.length; i++) {

			int[] nArray = new int[4];

			r1 = RandomNumbers.getRandomInt(low, up);

			r2 = RandomNumbers.getRandomInt(low,up);

			r3 = RandomNumbers.getRandomInt(low,up);

			r4 = RandomNumbers.getRandomInt(low,up);

			nArray[0] = r1;

			nArray[1] = r2;

			nArray[2] = r3;

			nArray[3] = r4;

			mArray[i] = nArray;

		}

		

		for(i=0; i<mArray.length; i++){

			if(i%2 == 0) {

				System.out.println("  " + mArray[i][0] + "\t" + "  " + mArray[i][1] + "\t" + "  " + mArray[i][2] + "\t" + "  " + mArray[i][3]);

			}else {

				System.out.println("+ " + mArray[i][0] + "\t" + "+ " + mArray[i][1] + "\t" + "+ " + mArray[i][2] + "\t" + "+ " + mArray[i][3]);

				System.out.println("  __" + "\t" + "  __" + "\t" + "  __" + "\t" + "  __");

				System.out.println("\n");

			}

			

		}

	}


}

//Output

/*   22	  84	  7	  41
	+ 41	+ 39	+ 42	+ 83
	__	  __	  __	  __
	

	93	  57	  59	  57
	+ 79	+ 37	+ 2	+ 44
	__	  __	  __	  __
*/