
public class Config {
	private int size,range,key;
	
	public void setSize(int size) {	this.size=size; }
	public void setRange(int range) { this.range=range; }
	public void setKey(int key) { this.key=key; }
	public int getSize() { return size; }
	public int getRange() {	return range; }
	public int getKey() { return key; }
	
	public Config(int size,int range,int key)
	{
		this.size=size;
		this.range=range;
		this.key=key;
	}
} 
