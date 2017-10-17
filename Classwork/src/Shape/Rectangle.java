package Shape;

public class Rectangle implements Shape {
	private double l;
	private double w;
	public Rectangle(double length, double width) {
		this.l = length;
		this.w = width;
	}
	public double perimeter(){
		return l*2+w*2;
	}
	public double area() {
		return l*w;
	}
}
