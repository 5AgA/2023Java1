import java.util.Scanner;

public class Practice66 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
        String[] sArray = {"하나", "두울", "세엣"};
        Integer[] iArray = {10, 20, 30, 40};
        
        System.out.println("문자열 배열의 내용입니다.");
        MyArray.displayArray(sArray);
        for (int i = 0; i < 2; i++) {
            int idx = sc.nextInt();
            System.out.print(idx + "번 인덱스 저장 내용: ");
            System.out.println(MyArray.pick(sArray, idx));
        }
        MyArray.swap(sArray, 0, sc.nextInt());
        System.out.println("변경 후 문자열 배열");
        MyArray.displayArray(sArray);
        
        System.out.println("정수형 배열의 내용입니다.");
        MyArray.displayArray(iArray);
        for (int i = 0; i < 2; i++) {
            int idx = sc.nextInt();
            System.out.print(idx + "번 인덱스 저장 내용: ");
            System.out.println(MyArray.pick(iArray, idx));
        }
        MyArray.swap(iArray, 0, sc.nextInt());
        System.out.println("변경 후 문자열 배열");
        MyArray.displayArray(iArray);
        
        sc.close();
    }
}