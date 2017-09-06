package lesson2;

public class cmdline {
	public static void main(String[] args) {
		int c=0;	
		String namestart;
		for(String s:args) {
			System.out.println("Length of string"+"\t"+s+"\t"+"is"+"\t"+s.length());
			namestart = s.substring(0, 1);
			if(namestart.equals("A"))
				c++;
		}	
		System.out.println("The number of string input starting with A: "+c);
	}
}

// Output:
/*

Length of string	Jane	is	4
Length of string	Ana	is	3
Length of string	Rita	is	4
Length of string	Aron	is	4
Length of string	Bob	is	3
Length of string	Ariana	is	6
The number of string input starting with A: 3

*/