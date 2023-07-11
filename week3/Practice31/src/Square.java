
public class Square {
	private int width;
	private int height;
	
	public void setWidth(int width) { this.width = width; }
	public void setHeight(int height) { this.height = height; }
	public int getWidth() { return this.width; }
	public int getHeight() { return this.height; }
	
	private int area() { return getWidth() * getHeight(); }
	public boolean isSmallerThan(Square s) {
		if (area() < s.area())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
 }
