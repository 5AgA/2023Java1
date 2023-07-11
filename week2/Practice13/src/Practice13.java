import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		int c, p;
		String v;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터의 생성: ");
		v = sc.next();
		c = searchValue(v);
		
		System.out.print("당신의 입력: ");
		v = sc.next();
		p = searchValue(v);
		
		if (c > p) {
			if (c - p == 2) {
				System.out.println("당신이 이겼습니다.");
			}
			else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}
		else if (c < p) {
			if (p - c == 2) {
				System.out.println("컴퓨터가 이겼습니다.");
			}
			else {
				System.out.println("당신이 이겼습니다.");
			}
		}
		else {
			System.out.println("비겼습니다.");
		}
		sc.close();
	}
	public static int searchValue(String str)
	{
		String[] value = {"가위", "바위", "보"};
		
		for (int i = 0; i < value.length; i++) {
			if (value[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
}
