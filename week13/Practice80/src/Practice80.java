// 컴퓨터학과 20220783 오은아
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("난수값이 저장된 파일 이름을 입력하세요: ");
			Scanner scan = new Scanner(new FileReader(sc.next()));
			System.out.println("파일에서 난수를 읽어 들입니다.");
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					a.add(scan.nextInt());					
				}
				else {
					scan.next();
				}
			}
			
			if (scan != null) scan.close();
			System.out.println("난수의 개수는 모두 " + a.size() + "개입니다.");
			System.out.println("입력된 난수는 다음과 같습니다.");
			printArray10PerLine(a);
			
			Collections.sort(a);
			System.out.println("정렬된 난수는 다음과 같습니다.");
			printArray10PerLine(a);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static void printArray10PerLine(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + "     ");
			if (i % 10 == 9)
				System.out.println("");
		}
		System.out.println("");
	}
}
