import java.util.Scanner;

public class Practice55 {

	public static void main(String[] args) {
		int x = 0, y = 0;
		boolean isDone = false;
		Scanner s = new Scanner(System.in);
		
		while (isDone != true) {
			try {
				System.out.print("1번 피연산자를 입력하세요: ");
				x = Integer.parseInt(s.next());
			} catch (NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			} 
			isDone = true;
		}
		isDone = false;
		while (isDone != true) {
			try {
				System.out.print("2번 피연산자를 입력하세요: ");
				y = Integer.parseInt(s.next());	
			} catch (NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}
			isDone = true;
		}
		System.out.print(x + " + " + y + " = " + (x + y));
		s.close();
	}

}
