import java.util.Scanner;
public class Practice36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date[] dateList = new Date[5];
		
		for (int i = 0; i < dateList.length; i++) {
			System.out.print((i + 1) + "번째 날짜를 입력하세요 : ");
			dateList[i] = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		
		for (int i = 0; i < dateList.length; i++) {
			System.out.println( (i + 1) + "번째 날짜는 " + dateList[i].toString() + "입니다.");
		}
		
		sc.close();
	}

}
