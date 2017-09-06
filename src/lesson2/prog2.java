package lesson2;

public class prog2 {
		
	public static void main(String[] args) {
		
		float f1 = 1.27f;
		float f2 = 3.881f;
		float f3 = 9.6f;
		
		float sum = f1 + f2 + f3;
		int new1 =(int)sum;
		int afterround = Math.round(sum);
		
		System.out.println("Sum of all floating numbers: "+sum);
		System.out.println("Sum of all floating numbers converted to integer: "+new1);
		System.out.println("Sum of all floating numbers converted into integer and rounded: "+afterround);
		}
}