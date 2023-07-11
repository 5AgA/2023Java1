import java.util.Scanner;

public class Practice40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("학생 숫자를 입력하세요: ");
		n = sc.nextInt();
		Student[] stList = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번 학생의 정보");
			stList[i] = new Student();
			System.out.print("이름: "); stList[i].setName(sc.next());
			System.out.print("학번: "); stList[i].setSid(sc.nextLong());
			System.out.print("전공: "); stList[i].setMajor(sc.next());
			System.out.println("");
		}
		
		System.out.println("입력된 학생의 정보입니다.");
		for (int i = 0; i < n; i++) {
			System.out.println("[" + (i + 1) + "] " + stList[i].printSafely());
		}
		
		for (int i = 1; i < n; i++) {
			System.out.print("\"" + stList[0].getName() + "\" 학생은 \"" + stList[i].getName()
					+ "\" 학생과 ");
			if (stList[0].equalsMajor(stList[i]) == true) {
				System.out.print("전공은 같고, ");
			}
			else {
				System.out.print("전공은 다르고, ");
			}
			int isS = stList[0].isSenior(stList[i]);
			if (isS == -1) {
				System.out.println("학번은 빠릅니다.");
			}
			else if (isS == 0) {
				System.out.println("학번은 같습니다.");
			}
			else if (isS == 1) {
				System.out.println("학번은 느립니다.");
			}
		}
		sc.close();
	}

}
