
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
	
	protected boolean isReap() {
		if (getYear() % 4 == 0)
		{
			if (getYear() % 100 == 0)
			{
				if (getYear() % 400 == 0)
				{
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	
	public String testReapYears() {
		String ret = "";
		ret += getYear() + "년은 윤년";
		if (isReap())
			ret += "입니다.";
		else 
			ret += "이 아닙니다.";
		
		return ret;
	}
	
	public String printWestern() {
		String[] month = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December"};
		
		return month[getMonth() - 1] + " " + getDay() + ", " + getYear();
	}
}
