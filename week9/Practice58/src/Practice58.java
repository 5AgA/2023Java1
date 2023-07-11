import java.util.Scanner;

public class Practice58 {
    // 메소드 헤더와 메소드 바디를 적절하게 작성하세요.
	public static int searchArray(int[] array, int key) throws NotFoundException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        throw(new NotFoundException());
    }
    
    // 메소드 헤더와 메소드 바디를 적절하게 작성하세요.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        int idx = 0;
        
        System.out.println("10개의 숫자를 입력하세요:");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        
        System.out.println("배열에 저장된 숫자입니다.");
        for (int obj : array) {
            System.out.print(obj + "     ");
        }
        
        System.out.print("\n숫자를 하나 입력하세요: ");
        int key = s.nextInt();
        try {
            idx = searchArray(array, key);
            System.out.println("입력된 숫자 " + key + "는 인덱스 " + idx + "번에 존재합니다.");
        } catch(NotFoundException e) {
            System.out.print("입력된 숫자 " + key + "는 ");
            System.out.println(e.getMessage());
        }
        s.close();
    }
}