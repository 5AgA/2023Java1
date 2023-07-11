import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double avg;
		int n, sum = 0, cnt = 0;
		
		do {
			System.out.print("숫자를 입력하세요: ");
			n = sc.nextInt();
			if (n < 0)
			{
				System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
			}
			else if (n > 0)
			{
				
				sum += n;
				cnt++;
			}
		} while (n != 0);
		
		avg = (double)sum / cnt;			
		
		System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
		System.out.println("입력된 숫자들 중에서 0보다 큰 숫자의 개수는 " + cnt + "입니다.");
		System.out.println("입력된 숫자들의 평균은 " + String.format("%.2f", avg) + "입니다.");			
		
		sc.close();

	}

}
