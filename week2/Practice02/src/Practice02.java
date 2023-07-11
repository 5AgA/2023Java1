import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하세요: ");
		int f = sc.nextInt();
		
		double c = 5.0 * (f - 32) / 9.0;
		
		System.out.printf("해당하는 섭씨 온도는 %.2f입니다.", c);
		
		sc.close();
	}

}
