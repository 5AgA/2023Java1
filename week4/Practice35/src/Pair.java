
public class Pair {
	private Integer x, y;
	
	void setX(Integer x) { this.x = x; }
	void setY(Integer y) { this.y = y; }
	Integer getX() { return this.x; }
	Integer getY() { return this.y; }
	
	public Pair() {}
	public Pair(Integer x, Integer y) { setX(x); setY(y); }
	
	public String toString() { return "(" + getX() + ", " + getY() + ")"; }
	
	public static Pair add(Pair a, Pair b) { 
		return new Pair((a.getX() + b.getX()), (a.getY() + b.getY()));
	}
	public static Pair sub(Pair a, Pair b) { 
		return new Pair((a.getX() - b.getX()), (a.getY() - b.getY()));
	}
	public static Pair mult(Pair a, Pair b) { 
		return new Pair((a.getX() * b.getX()), (a.getY() * b.getY()));
	}
	public static Pair div(Pair a, Pair b) { 
		return new Pair((a.getX() / b.getX()), (a.getY() / b.getY()));
	}
	
}
