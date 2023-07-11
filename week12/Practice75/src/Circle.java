
public class Circle {    
    	// 여기에 필요한 코드를 작성하세요.
    private Point center;
    private int radius;
    
    public Circle() { 
        center = new Point();
        center.setX(0); 
        center.setY(0); 
        radius = 0; 
    }
    public Circle(int x, int y, int radius) { 
        center = new Point();
        setCenter(x, y);
        this.radius = radius; 
    }
    public Circle(Point p, int radius) {
        center = new Point();
        center = p;
        this.radius = radius;
    }
    
    public void setCenter(int x, int y) {
        center.setX(x); center.setY(y);
    }
    public void setRadius(int radius) { this.radius = radius; }
    public Point getCenter() { return center; }
    public int getRadius() { return this.radius; }
    
    public String toString() {
        return center.toString() + "반지름: " + getRadius() + "\n";
    }
}