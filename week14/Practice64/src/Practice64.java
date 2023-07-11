import java.util.Scanner;

public class Practice64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sf, ss;
		int intf, ints;
		
		System.out.println("문자열로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫번째 원소를 입력하세요: "); sf = sc.next();
		System.out.print("두번째 원소를 입력하세요: "); ss = sc.next();
		MyPair<String> p1 = new MyPair<String>(sf, ss);
		System.out.println("만들어진 순서쌍: " + p1.toString());
		System.out.print("변경할 원소를 선택하세요(1/2): "); 
		int change = sc.nextInt();
		System.out.print("변경할 원소를 입력하세요: "); 
		if (change == 1) {
			p1.first = sc.next();
		}
		else if (change == 2) {
			p1.second = sc.next();
		}
		System.out.println("만들어진 순서쌍: " + p1.toString());
		
		
		System.out.println("\n숫자로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫번째 원소를 입력하세요: "); intf = sc.nextInt();
		System.out.print("두번째 원소를 입력하세요: "); ints = sc.nextInt();
		MyPair<Integer> p2 = new MyPair<Integer>(intf, ints);
		System.out.println("만들어진 순서쌍: " + p2.toString());
		System.out.print("변경할 원소를 선택하세요(1/2): "); 
		change = sc.nextInt();
		System.out.print("변경할 원소를 입력하세요: "); 
		if (change == 1) {
			p2.first = sc.nextInt();
		}
		else if (change == 2) {
			p2.second = sc.nextInt();
		}
		System.out.println("만들어진 순서쌍: " + p2.toString());
		sc.close();
	}

}
