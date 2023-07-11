import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Practice74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		try {
			Config c = getInput();
			ArrayList<Integer> random = new ArrayList<Integer>();
			do {
				random = getRandomNumbers(c);
				System.out.print("(" + count + "차) ");
				printArray(random);
				count++;
			} while (searchArray(random, c.getKey()) != true);
			System.out.println((count - 1) + "차 실행에서 난수 " + c.getKey() + "이 발생했으므로 프로그램을 종료합니다.");
		} catch (ImproperKeyValueException e) {
			System.out.println(e.getMessage());
		}
	}

	private static Config getInput() throws ImproperKeyValueException {
		Scanner sc = new Scanner(System.in);
		int size, range, key = 0;
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		size = sc.nextInt();
		System.out.print("난수값의 범위를 설정하세요: ");
		range = sc.nextInt();

		System.out.print("찾고 싶은 난수값을 입력하세요: ");
		key = sc.nextInt();
		sc.close();

		if (key > range || key < 0)
			throw (new ImproperKeyValueException());

		return (new Config(size, range, key));
	}

	private static ArrayList<Integer> getRandomNumbers(Config c) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> random = new ArrayList<Integer>();
		for (int i = 0; i <= c.getRange(); i++)
			list.add(i);
		Collections.shuffle(list);
		for (int i = 0; i < c.getSize(); i++)
			random.add(list.get(i));
		return random;
	}

	private static void printArray(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if ((i + 1) % 10 == 0)
				System.out.print("\n");
		}
		System.out.print("\n");
	}

	private static boolean searchArray(ArrayList<Integer> list, Integer key) {
		int index = Collections.binarySearch(list, key);
		if (index < 0)
			return false;
		else
			return true;
	}
}
