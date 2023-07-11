import java.util.Scanner;

public class Practice42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		double w, l, b, h;
		
		/*
		 * System.out.print("도형의 X좌표를 입력하세요: "); x = sc.nextInt();
		 * System.out.print("도형의 Y좌표를 입력하세요: "); y = sc.nextInt(); Shape s = new
		 * Shape(x, y); System.out.println("");      추상 메소드로 객체를 생성할 수 없음
		 */
		
		System.out.print("사각형의 X좌표를 입력하세요: ");
		x = sc.nextInt();
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		y = sc.nextInt();
		System.out.print("사각형의 가로를 입력하세요: ");
		w = sc.nextDouble();
		System.out.print("사각형의 세로를 입력하세요: ");
		l = sc.nextDouble();
		Rectangle r = new Rectangle(x, y, l, w);
		System.out.println("");
		
		System.out.print("삼각형의 X좌표를 입력하세요: ");
		x = sc.nextInt();
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		y = sc.nextInt();
		System.out.print("삼각형의 밑변을 입력하세요: ");
		b = sc.nextDouble();
		System.out.print("삼각형의 높이를 입력하세요: ");
		h = sc.nextDouble();
		Triangle t = new Triangle(x, y, b, h);
		System.out.println("");
		
		/*
		 * System.out.println("입력된 도형의 정보입니다"); System.out.println(s.toString() + "\n");
		 */
		System.out.println("입력된 사각형의 정보입니다");
		System.out.println(r.toString() + "\n");
		System.out.println("입력된 삼각형의 정보입니다");
		System.out.println(t.toString() + "\n");
		
		sc.close();

	}

}
