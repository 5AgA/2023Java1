import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인치 값을 입력하세요: ");
		
		float i = sc.nextFloat();
		int c = (int)(2.54 * i);
		
		System.out.println("해당하는 센티미터 값은 " + c + "입니다.");
		
		sc.close();
	}

}
