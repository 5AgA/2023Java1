import java.util.Scanner;

public class Practice76 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        
        Movie m1 = new Movie();
        Movie m2 = new Movie(sc.next(), sc.next());
        Date vd1 = new Date();
        vd1.setYear(sc.nextInt());
        vd1.setMonth(sc.nextInt());
        vd1.setDay(sc.nextInt());
        m2.setViewDay(vd1);
        Date vd2 = new Date();
        Movie m3 = new Movie(sc.next(), sc.next(), vd2);
        vd2.setYear(sc.nextInt());
        vd2.setMonth(sc.nextInt());
        vd2.setDay(sc.nextInt());
        
        System.out.println("첫 번째 영화의 정보입니다.\n" + m1);
        System.out.println("두 번째 영화의 정보입니다.\n" + m2);
        System.out.println("세 번째 영화의 정보입니다.\n" + m3);
        
        sc.close();
    }
}
