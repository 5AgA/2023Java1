
public abstract class Shape {
	private int x, y;
	
	protected void setX(int x) { this.x = x; }
	protected void setY(int y) { this.y = y; }
	protected int getX() { return this.x; }
	protected int getY() { return this.y; }
	
	protected Shape() { this(0, 0); }
	protected Shape(int x, int y) { setX(x); setY(y); } 
	
	public abstract double calcArea();
	public String toString() { return "중심좌표: (" + getX() + ", " + getY() + ")"; }
}
	
//추상 메소드라서 자식 클래스들과 메인 클래스 만 이 클래스를 사용하기 때문