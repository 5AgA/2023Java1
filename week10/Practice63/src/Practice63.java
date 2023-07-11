import java.util.Scanner;

public class Practice63 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            MyBox<String> box1 = new MyBox<String>(s.next());
            System.out.println("MyBox에 저장된 내용: " + box1.get());
        }
        int sum = 0;
        MyBox<Integer> box2 = new MyBox<Integer>(s.nextInt());
        MyBox<Integer> box3 = new MyBox<Integer>(s.nextInt());
        sum += box2.get() + box3.get();
        
        System.out.println(box2.get() + " + " + box3.get() + " = " + sum);
        
        s.close();
    }
}