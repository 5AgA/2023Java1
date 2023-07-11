import java.util.Scanner;

public class Practice56A {

	public static void main(String[] args) {
		int[] iArray = getInput();
		
		for (int i = 0; i < iArray.length; i++) {
			iArray[i]= i * 20;
		}
		
		for (int x: iArray) {
			System.out.print(x + "\t");
		}

	}
	
	public static int[] getInput() {
		Scanner s = new Scanner(System.in);
		int[] rslt = new int[0];
		
		System.out.print("배열의 크기를 입력하세요: ");
		try {
			String str = s.next();			
			int num = Integer.parseInt(str);
			rslt = makeArray(num);
		} catch (NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		}
		
		s.close();
		
		return rslt;
	}

	public static int[] makeArray(int size) {
		int[] rslt = new int[0];
		try {
			rslt = new int[size];			
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수입니다.");
		}
		
		return rslt;
	}
}
