
public class MyPair<T> {
	private T first;
    private T second;
    
    public MyPair(T first, T second) { setFirst(first); setSecond(second); }
    void setFirst(T first) { this.first = first; }
    void setSecond(T second) {this.second = second; }
    T getFirst() { return first; }
    T getSecond() { return second; }
    public String toString() {
        String ret = "";
        ret += "만들어진 순서쌍: ";
        ret += "(" + getFirst() + ", " + getSecond() + ")";
        return ret;
    }
}
