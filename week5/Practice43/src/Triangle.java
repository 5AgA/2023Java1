
public class Triangle extends Shape{
	private double base, height;
	
	void setBase(double base) { this.base = base; }
	void setHeight(double height) { this.height = height; }
	public double getBase() { return this.base; }
	public double getHeight() { return this.height; }
	
	public Triangle() { this(0, 0, 0, 0); }
	public Triangle(int x, int y) { this(x, y, 0, 0); }
	public Triangle(int x, int y, double base, double height) {
		super(x, y); setBase(base); setHeight(height);
	}
	
	public double calcArea() { return getBase() * getHeight() / 2; }
	public String toString() { 
		String ret = "";
		ret += super.toString();
		ret += "밑변: " + String.format("%.2f", getBase()) + ", ";
		ret += "높이: " + String.format("%.2f", getHeight()) + ", ";
		ret += "면적 : " + String.format("%.2f", calcArea());
		
		return ret;
	}

}
