
public class MyPair<T> {
	T first, second;
	
	public MyPair(T first, T second) {
		this.first = first; this.second = second;
	}
	
	public String toString() {
		return "(" + first + "," + second + ")";
	}
}
