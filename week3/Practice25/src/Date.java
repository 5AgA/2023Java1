
public class Date {
	private int year, month, day;
	
	void setYear(int year) { this.year = year; }
	void setMonth(int month) { this.month = month; }
	void setDay(int day) { this.day = day; }
	int getYear() { return this.year;}
	int getMonth() { return this.month;}
	int getDay() { return this.day; }
	
	public Date() { this(1990, 1, 1); }
	public Date(int year) { this(year, 1, 1); }
	public Date(int year, int month) { this(year, month, 1); }
	public Date(int year, int month, int day) { setYear(year); setMonth(month); setDay(day); }
	
	public String toString() {
		String ret = "";
		ret += getYear() + "년 ";
		ret += getMonth() + "월 ";
		ret += getDay() + "일";
		return ret;
	}
}
