import java.util.Scanner;
public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int cnt = 0;
		
		do {
			System.out.print("정수를 입력하세요: ");
			n = sc.nextInt();
			if (n < 1)
			{
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		} while (n < 1);
		
		for (int i = 1; i < (n + 1); i++)
		{
			if (i % 5 != 0)
			{
				System.out.print(i + "     ");		
				cnt++;
			}
			if (cnt % 7 == 0)
			{
				System.out.print("\n");
			}
		}
		
		sc.close();
	}

}
