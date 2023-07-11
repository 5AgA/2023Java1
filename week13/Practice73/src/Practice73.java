import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice73 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		
		ArrayList<Integer> original = new ArrayList<Integer>();
		for (int i = 0; i < num; i++)
			original.add(randomList.get(i));
		Collections.sort(randomList);
		System.out.println("정렬된 난수는 다음과 같습니다.");
		printArray10PerLine(randomList);
		
		System.out.println("원래의 난수 배열은 다음과 같습니다.");
		printArray10PerLine(original);
		System.out.println("가장 큰 값: " + randomList.get(0) + ",가장 작은 값: " + randomList.get(num - 1));
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
