import java.util.Scanner;
import java.util.*;

public class Practice71 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        int num = 0;
        
        Set<Integer> intSet = new HashSet<Integer>();
        
        while(num != 5) {
            if(!intSet.add(sc.nextInt())) {
                System.out.println( num + "개의 숫자가 입력되었습니다.");
                continue;
            }
            System.out.println( ++num + "개의 숫자가 입력되었습니다.");
        }
        System.out.println(intSet);
        
        sc.close();
    }
}