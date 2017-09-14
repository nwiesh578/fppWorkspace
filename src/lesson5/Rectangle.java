package lesson5;

public class Rectangle extends Shape {
	int width, height;

	public Rectangle(boolean color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return height*width;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*(width+height);
	}
	
}
