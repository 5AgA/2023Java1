
public class Date {
		// 여기에 필요한 코드를 작성하세요. 
    private int year, month, day;
    
    void setYear(int year) { this.year = year; }
    void setMonth(int month) { this.month = month; }
    void setDay(int day) { this.day = day; }
    int getYear() { return year; }
    int getMonth() { return month; }
    int getDay() { return day; }
    
    public Date() {
        setYear(1999);
        setMonth(9);
        setDay(9);
    }
    
    public String toString() {
        return getYear() + "년 " + getMonth() + "월 " + getDay() + "일\n";
    }
    
    public static int compareDate(Date x, Date y) {
		if (x.getYear() < y.getYear())
			return -1;
		else if (x.getYear() > y.getYear())
			return 1;
		else
		{
			if (x.getMonth() < y.getMonth())
				return -1;
			else if (x.getMonth() > y.getMonth())
				return 1;
			else
			{
				if (x.getDay() < y.getDay())
					return -1;
				else if (x.getDay() > y.getDay())
					return 1;
				else
					return 0;
			}
		}
	}
}
