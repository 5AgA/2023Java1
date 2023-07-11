
public class Triangle extends Shape implements Drawable{
	private double base, height;
	
	void setBase(double b) { base = b; }
	void setHeight(double h) { height = h; }
	double getBase() { return base; }
	double getHeight() { return height; }
	
	public Triangle() {
		this(-1, -1, -1, -1);
	}
	public Triangle(int x, int y) {
		this(x, y, -1, -1);
	}
	public Triangle(int x, int y, double b, double h) {
		super(x, y); setBase(b); setHeight(h);
	}
	
	public double calcArea() {
		return base * height / 2;
	}
	public String toString() {
		String ret = "";
		ret += super.toString() + ", ";
		ret += "밑변: " + String.format("%.2f", base) + ", ";
		ret += "높이: " + String.format("%.2f", height) + ", ";
		ret += "면적: " + String.format("%.2f", calcArea());
		
		return ret;
	}
	public void draw() {
		System.out.println("삼각형, " + toString());
	}
}
