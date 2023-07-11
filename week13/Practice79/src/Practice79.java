import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Practice79 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			int num;
			System.out.print("원하는 난수의 개수를 입력하세요: ");
			num = sc.nextInt();
			
			int max;
			System.out.print("난수 값의 범위를 설정하세요: ");
			max = sc.nextInt();
			
			ArrayList<Integer> randomList = new ArrayList<Integer>();
			randomList = getRandomList(num, max);
			
			System.out.println("생성된 난수 배열은 다음과 같습니다.");
			printArray10PerLine(randomList);
			
			System.out.print("난수 값을 저장할 파일 이름을 입력하세요: ");
			String fileName = sc.next();
			PrintWriter arr = new PrintWriter(new FileWriter(fileName));
			
			for (int i = 0; i < num; i++) {
				arr.print(randomList.get(i) + "     ");
				if (i % 10 == 9)
					arr.println();
			}
			
			if (arr != null) arr.close();
			System.out.println("파일 " + fileName + "에 난수값이 저장되었습니다.");
		} catch (IOException e) {
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
	public static ArrayList<Integer> getRandomList(int size, int range) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < range + 1; i++)
			a.add(i);
		Collections.shuffle(a);
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			ret.add(a.get(i));
		return ret;
	}
}
