
public class BodyData {
	private int weight;
	private int height;
	
	public void setWeight(int weight) { this.weight = weight; }
	public void setHeight(int height) { this.height = height; }
	public int getWeight() { return this.weight; }
	public int getHeight() { return this.height; }
	
	public int idealWeight() { return getHeight() - 110; }
	public boolean needDiet() {
		if (getWeight() > idealWeight())
			return true;
		else
			return false;
	}
	public boolean isTallerThan(BodyData b) {
		if (b.getHeight() > getHeight())
			return false;
		else
			return true;
	}
}
