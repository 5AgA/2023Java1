
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
}