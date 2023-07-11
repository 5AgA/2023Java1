
public class Date {
	private int year, month, day;
	
	void setYear(int year) { this.year = year; }
	void setMonth(int month) { this.month = month; }
	void setDay(int day) { this.day = day; }
	int getYear() { return this.year;}
	int getMonth() { return this.month;}
	int getDay() { return this.day; }
	
	public String toString() {
		String ret = "";
		ret += getYear() + "년 ";
		ret += getMonth() + "월 ";
		ret += getDay() + "일\n";
		return ret;
	}

}
