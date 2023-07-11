import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Practice79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.print("원하는 난수의 개수를 입력하세요: ");
			int n = sc.nextInt();
			System.out.print("난수 값의 범위를 설정하세요: ");
			int r = sc.nextInt();
			
			ArrayList<Integer> random = new ArrayList<Integer>();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i <= r; i++)
				random.add(i);
			Collections.shuffle(random);
			for (int i = 0; i < n; i++)
				arr.add(random.get(i));
			System.out.println("생성된 난수는 다음과 같습니다.");
			for (int i = 0; i < n; i++) {
				System.out.print(arr.get(i) + "\t");
				if (i % 10 == 9)
					System.out.println("");
			}
			
		try {
			System.out.print("\n난수 값을 저장할 파일 이름을 입력하세요: ");
			String fileName = sc.next();
			PrintWriter pw = new PrintWriter(new FileWriter(fileName));
			
			for (int i = 0; i < n; i++) {
				pw.print(arr.get(i));
				if (i % 10 == 9)
					pw.print("\n");
				else
					pw.print("\t");
			}
			
			if (pw != null) {
				pw.close();
			}
			
			System.out.println("파일 " + fileName + "에 난수값이 저장되었습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
