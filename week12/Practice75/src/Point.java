
public class Point {
		// 여기에 필요한 코드를 작성하세요. 
    private int x, y;
    
    public void setX(int x) { this.x = x;}
    public void setY(int y) { this.y = y;}
    public int getX() {return x;}
    public int getY() {return y;}
    
    public Point() { setX(0); setY(0); }
    
    public String toString() {
        return "중심좌표: (" + getX() + ", " + getY() + ")\n";
    }
}
