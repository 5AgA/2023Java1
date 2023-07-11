
public class Shape {
	private int x, y;
	
	void setX(int x) { this.x = x; }
	void setY(int y) { this.y = y; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	
	public Shape() { this(0, 0); }
	public Shape(int x, int y) { setX(x); setY(y); }
	
	public double calcArea() { return -1; }
	public String toString() { return "중심좌표: (" + getX() + ", " + getY() + ")"; }
}
