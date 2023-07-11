import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		if (num < 0)
		{
			System.out.println("입력한 정수 " + num + "은 음수입니다.");
		}
		else if (num >= 0 && num % 2 == 0)
		{
			System.out.println("입력한 정수 " + num + "은 짝수입니다.");
		}
		else 
		{
			System.out.println("입력한 정수 " + num + "은 홀수입니다.");
		}
		
		sc.close();
	}

}
