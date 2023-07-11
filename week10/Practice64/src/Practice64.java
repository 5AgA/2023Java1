import java.util.Scanner;

public class Practice64 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        MyPair<String> p1 = new MyPair<String>(sc.next(), sc.next());
        System.out.println(p1.toString());
        
        int c = sc.nextInt();
        if (c == 1) {
            p1.setFirst(sc.next());
        }
        else if (c == 2) {
            p1.setSecond(sc.next());
        }
        System.out.println(p1.toString());
        
        MyPair<Integer> p2 = new MyPair<Integer>(sc.nextInt(), sc.nextInt());
        System.out.println(p2.toString());
        Integer sum = p2.getFirst() + p2.getSecond();
        System.out.println(p2.getFirst() + " + " + p2.getSecond() + " = " + sum);
        sc.close();
    }
}