package Lesson1;

public class Prog1 {

	public static void main(String[] args){
		
		final float pi = (float) Math.PI;
		int low = 1;
		int upp = 9;
		RandomNumbers.getRandomInt(low, upp);
		int x = RandomNumbers.getRandomInt(low,upp);
		System.out.println(x);
		float res = (float) Math.pow(pi, x);
		System.out.println(res);
		
		low = 3;
		upp = 14;
		int y = RandomNumbers.getRandomInt(low,upp);
		System.out.println(y);
		float res1 = (float) Math.pow(y, pi);
		System.out.println(res1);
	}	
}

// Output

/*	1
	3.1415927
	9
	995.0418
*/