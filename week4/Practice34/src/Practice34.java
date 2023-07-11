
public class Practice34 {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(2006);
		Date d3 = new Date(2007, 2);
		Date d4 = new Date(2007, 3, 2);
		Date d5 = new Date(2007, 4);
		Date d6 = new Date(2007, 4,26);
		
		d1.setYear(2007);
		d1.setMonth(2);
		d1.setDay(18);
		d2.setMonth(3);
		d2.setDay(2);
		d3.setDay(27);
		d5.setDay(20);
		
		System.out.println("오늘은 " + d1.toString() + "입니다.");
		System.out.println("내가 동덕여대에 입학한 날짜는 " + d2.toString() + "입니다.");
		System.out.println("2007학년도 개강일은 " + d3.toString() + "에서 " + d4.toString() + "로 변경되었습니다.");
		System.out.println("중간고사 기간은 " + d5.toString() + "부터 " + d6.toString() + "까지 입니다.");
	}

}
