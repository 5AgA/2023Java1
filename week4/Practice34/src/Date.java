
public class Date {
	private Integer year, month, day;
	
	void setYear(Integer year) { this.year = year; }
	void setMonth(Integer month) { this.month = month; }
	void setDay(Integer day) { this.day = day; }
	Integer getYear() { return this.year;}
	Integer getMonth() { return this.month;}
	Integer getDay() { return this.day; }
	
	public Date() { this(1990, 1, 1); }
	public Date(Integer year) { this(year, 1, 1); }
	public Date(Integer year, Integer month) { this(year, month, 1); }
	public Date(Integer year, Integer month, Integer day) { setYear(year); setMonth(month); setDay(day); }
	
	public String toString() {
		return getYear() + "년 " + getMonth() + "월 " + getDay() + "일";
	}

}
