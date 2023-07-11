import java.util.Scanner;
public class Practice35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pair p1 = new Pair();
		Pair p2 = new Pair();
	
		System.out.print( "1번째 순서쌍 x좌표: ");
		p1.setX(sc.nextInt());
		System.out.print( "1번째 순서쌍 y좌표: ");
		p1.setY(sc.nextInt());
		System.out.print( "2번째 순서쌍 x좌표: ");
		p2.setX(sc.nextInt());
		System.out.print( "2번째 순서쌍 y좌표: ");
		p2.setY(sc.nextInt());
		
		System.out.println("입력된 1번 순서쌍: " + p1.toString());
		System.out.println("입력된 2번 순서쌍: " + p2.toString());
		
		Pair p3 = Pair.add(p1, p2);
		Pair p4 = Pair.sub(p1, p2);
		Pair p5 = Pair.mult(p1, p2);
		Pair p6 = Pair.div(p1, p2);
		
		System.out.println("덧셈 결과: " + p3.toString());
		System.out.println("뺄셈 결과: " + p4.toString());
		System.out.println("곱셈 결과: " + p5.toString());
		System.out.println("나눗셈 결과: " + p6.toString());
		
		sc.close();
	}

}
