import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int sum = 0;
		
		do
		{
			System.out.print("숫자를 입력하세요: ");
			n = sc.nextInt();
			if (n < 0)
			{
				System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
			}
			else
			{
				sum += n;				
			}
		} while (n != 0);
		
		System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
		
		sc.close();
	}

}
