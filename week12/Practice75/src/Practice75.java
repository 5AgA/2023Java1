import java.util.Scanner;

public class Practice75 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        Circle c2 = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Point p = new Point();
        p.setX(60); p.setY(70);
        Circle c3 = new Circle(p, 80);
        Point p1 = new Point();
        p1.setX(sc.nextInt()); p1.setY(sc.nextInt());
        Circle c4 = new Circle(p1, sc.nextInt());
        
        System.out.println("첫번째 원 c1의 정보입니다.\n" + c1.toString());
        System.out.println("첫번째 원 c2의 정보입니다.\n" + c2.toString());
        System.out.println("첫번째 원 c3의 정보입니다.\n" + c3.toString());
        System.out.println("첫번째 원 c4의 정보입니다.\n" + c4.toString());
        
        sc.close();
    }
}
