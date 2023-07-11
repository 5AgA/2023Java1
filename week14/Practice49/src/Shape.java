
public class Shape implements Movable{
	private int x, y;
	
	void setX(int x) { this.x = x; }
	void setY(int y) { this.y = y; }
	int getX() { return x; }
	int getY() { return y; }
	
	public Shape() { this(-1, -1); }
	public Shape(int x, int y) {
		setX(x); setY(y);
	}
	
	public double calcArea() {
		return -1;
	}
	public String toString() {
		return "중심좌표: (" + getX() + ", " + getY() + ")";
	}
	public void move(int dx, int dy) {
		setX(x + dx); setY(y + dy);
	}
}
