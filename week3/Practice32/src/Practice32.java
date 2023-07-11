import java.util.Scanner;

public class Practice32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w1, h1, w2, h2;
		
		System.out.print("사각형1의 가로를 입력: ");
		w1 = sc.nextInt();
		System.out.print("사각형1의 세로를 입력: ");
		h1 = sc.nextInt();
		System.out.print("사각형2의 가로를 입력: ");
		w2 = sc.nextInt();
		System.out.print("사각형2의 세로를 입력: ");
		h2 = sc.nextInt();
		
		if (Square.getInstance(w1, h1).isSmallerThan(Square.getInstance(w2, h2)))
		{
			System.out.println("사각형1의 넓이가 더 작습니다.");
		}
		else if (Square.getInstance(w2, h2).isSmallerThan(Square.getInstance(w1, h1)))
		{
			System.out.println("사각형2의 넓이가 더 작습니다.");
		}
		else
		{
			if (Square.getInstance(w2, h2).isSmallerThan(Square.getInstance(w1, h1)) == false)
				System.out.println("두 사각형의 넓이가 같습니다.");
		}
		sc.close();

	}

}
