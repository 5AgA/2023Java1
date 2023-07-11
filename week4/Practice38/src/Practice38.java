import java.util.Scanner;
public class Practice38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date[] dateList = new Date[5];
		int idx = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 날짜를 입력하세요 :");
			dateList[i] = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		Date earlist = dateList[0];
		for (int i = 0; i < 5; i++) {
			if (Date.compareDate(earlist, dateList[i]) == 1) {
				earlist = dateList[i];
				idx = i;
			}
		}
		
		System.out.println("가장 빠른 날짜는 " + (idx + 1) + "번째 입력된 " + dateList[idx].toString() + "입니다.");
		
		sc.close();
	}

}
