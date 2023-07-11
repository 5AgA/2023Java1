
public class Rectangle extends Shape{
	private double length, width;
	
	void setLength(double length) { this.length = length; }
	void setWidth(double width) { this.width = width;}
	public double getLength() { return this.length; }
	public double getWidth() { return this.width; }
	
	public Rectangle() { this(0, 0, 0, 0); }
	public Rectangle(int x, int y) { this(0, 0, 0, 0); }
	public Rectangle(int x, int y, double length, double width) {
		super(x, y); setLength(length); setWidth(width);
	}
	
	public double calcArea() { return getWidth() * getLength(); }
	public String toString() {
		String ret = "";
		ret += super.toString() + ", ";
		ret += "가로: " + String.format("%.2f", getWidth()) + ", ";
		ret += "세로: " + String.format("%.2f", getLength()) + ", ";
		ret += "면적 : " + String.format("%.2f", calcArea());
		
		return ret;
	}
}
