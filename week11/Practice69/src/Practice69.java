import java.util.Scanner;


public class Practice69 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        
        RandomList<Integer> iArray = new RandomList<Integer>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            iArray.add(sc.nextInt());
        }
        iArray.print();
        System.out.println("마지막 원소 출력: " + iArray.selectLast() + "\n");
        
        RandomList<String> sArray = new RandomList<String>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sArray.add(sc.next());
        }
        sArray.print();
        System.out.println("마지막 원소 출력: " + sArray.selectLast());
        
        sc.close();
    }
}