import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
			
			if (num < 1)
			{
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		} while(num < 1);
		
		boolean isP = isPrime(num);
		if (isP)
		{
			System.out.println("입력된 숫자 " + num + "은 소수입니다.");
		}
		else
		{
			System.out.println("입력된 숫자 " + num + "은 소수가 아닙니다.");
		}
		sc.close();
	}
	public static boolean isPrime(int n)
	{
		if (n == 1) {
            return false;
        }
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
