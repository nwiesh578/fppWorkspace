package assignment5.problem3;

public class Driver {
	public static void main(String[] args) {
		Figure[] f = {new UpwardHat(), 
				new DownwardHat(), 
				new FaceMaker1(), 
				new Vertical()};
		
		print(f);
	}
	
	public static void print(Figure[] f) {
		
		for(Figure fig : f) {
		  fig.getFigure();
		}
		String s;
		for(Figure fig : f) {
			s = fig.getClass().getSimpleName();
			System.out.println("\t");
			System.out.print(s+"\t");
			fig.getFigure();
		}
	}
}

/*	Output
	
	/\ \/ :) ||
	
	UpwardHat	/\ 	
	DownwardHat	\/ 	
	FaceMaker1	:) 	
	Vertical	||
*/
