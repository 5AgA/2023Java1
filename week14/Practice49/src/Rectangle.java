
public class Rectangle extends Shape implements Drawable{
	private double length, width;
	
	void setLength(double length) { this.length = length; }
	void setWidth(double width) { this.width = width; }
	double getLength() { return length; }
	double getWidth() { return width; }
	
	public Rectangle() { this(-1, -1, -1, -1); }
	public Rectangle(int x, int y) {
		this(x, y, -1, -1);
	}
	public Rectangle(int x, int y, double length, double width) {
		super(x, y); setLength(length); setWidth(width);
	}
	
	public double calcArea() {
		return length * width;
	}
	public String toString() {
		return super.toString() + ", 가로: " + String.format("%.2f", getWidth()) + ", 세로: "
				+ String.format("%.2f", getLength()) + ", 면적: " + String.format("%.2f", calcArea());
	}
	public void draw() {
		System.out.println("사각형, " + toString());
	}
}
