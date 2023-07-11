import java.util.Scanner;

public class Practice49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("도형의 정보를 입력하세요 (X좌표, Y좌표):");
		Shape shape = new Shape(sc.nextInt(), sc.nextInt());
		
		System.out.print("사각형의 정보를 입력하세요 (X좌표, Y좌표, 세로, 가로):");
		Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.print("삼각형의 정보를 입력하세요 (X좌표, Y좌표, 밑변, 높이):");
		Triangle t = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println("\n입력된 정보입니다.");
		System.out.println(shape.toString());
		r.draw(); t.draw();
		
		System.out.print("\n중심좌표 이동 거리를 입력하세요 (dx, dy):");
		int dx, dy;
		dx = sc.nextInt(); dy = sc.nextInt();
		shape.move(dx, dy); r.move(dx, dy); t.move(dx, dy);
		
		System.out.println("\n이동된 도형의 정보입니다.");
		System.out.println(shape.toString());
		r.draw(); t.draw();
		
		sc.close();
	}
	
}
