package lesson5;

public class Test {
	public static void main(String[] arg) {
		Shape[] s = { new Circle(true,2), 
				new Rectangle(true,2,3),
				new Square(false,3),
				new Circle(false,3),
				new Square(true,4)};
		printTotal(s);
		
	}
	public static void printTotal(Shape[] s) {
		double totalperi = 0.0;
		double totalarea = 0.0;
		for(Shape sh : s) {
			totalperi = sh.calculatePerimeter() + totalperi;
			totalarea = sh.calculateArea() + totalarea;
		}
		System.out.println("The total perimeter of all the shapes : "+totalperi);
		System.out.println("The total area of all the shapes : "+totalarea);
	}
}

	/*Output
	
	The total perimeter of all the shapes : 69.41592653589794
	The total area of all the shapes : 71.84070449666731
	
	*/
