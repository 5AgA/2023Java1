import java.util.Scanner;

public class Practice56D {

	public static void main(String[] args) {
		int[] iArray = new int[0];
		try {
			iArray = getInput();
		} catch(NumberFormatException e) {
			System.out.println("잘못된 형식의 숫자입니다.");
		}
		
		for (int i = 0; i < iArray.length; i++) {
			iArray[i]= i * 20;
		}
		
		for (int x: iArray) {
			System.out.print(x + "\t");
		}

	}
	
	public static int[] getInput() throws NumberFormatException{
		Scanner s = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요: ");
		String str = s.next();	
		int num = Integer.parseInt(str);
		
		int[] rslt = new int[0];
		try {
			rslt = makeArray(num);			
		} catch (NegativeArraySizeException e){
			System.out.println("배열의 크기가 음수입니다.");
		}
		
		s.close();
		return rslt;
	}

	public static int[] makeArray(int size) throws NegativeArraySizeException{
		int[] rslt = new int[0];
		rslt = new int[size];
		
		return rslt;
	}
}
