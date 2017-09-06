package lesson2;

	import java.util.Scanner;

	public class Reverse {
		
		public static void main(String[] args) {
			//String res="";
			Scanner in = new Scanner(System.in);
			System.out.print("Type your name: ");
			String name = in.nextLine();
			System.out.println(name);
			for(int i = name.length()-1; i>=0; i--) {
				//res= res + name.charAt(i);
				System.out.print(name.charAt(i));
			}
			in.close();			
		}

	}
