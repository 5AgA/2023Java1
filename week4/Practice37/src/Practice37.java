import java.util.Scanner;
public class Practice37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("첫 번째 날짜를 입력하세요.");
		System.out.print("년도: ");
		y = sc.nextInt();
		System.out.print("월: ");
		m = sc.nextInt();
		System.out.print("일: ");
		d = sc.nextInt();
		Date d1 = new Date(y, m, d);
		System.out.println("두 번째 날짜를 입력하세요.");
		System.out.print("년도: ");
		y = sc.nextInt();
		System.out.print("월: ");
		m = sc.nextInt();
		System.out.print("일: ");
		d = sc.nextInt();
		Date d2 = new Date(y, m, d);
		
		if (Date.compareDate(d1, d2) == -1)
			System.out.println("첫 번째 날짜인 " + d1.toString() + "이 이른 날짜입니다.");
		else if (Date.compareDate(d1, d2) == 0)
			System.out.println("두 날짜는 같은 날짜입니다.");
		else if (Date.compareDate(d1, d2) == 1)
			System.out.println("두 번째 날짜인 " + d2.toString() + "이 이른 날짜입니다.");
			
		sc.close();
	}

}
