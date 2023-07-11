import java.util.Scanner;

public class Practice46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount[] ac = new BankAccount[3];
		int num = -1, choice;
		
		for (int i = 0; i < 3; i++) {
			ac[i] = new BankAccount();
			System.out.print("예금주 이름을 이력하세요:");
			ac[i].setOwner(sc.next());
			System.out.print("잔고를 입력하세요:");
			ac[i].setBalance(sc.nextInt());
		}
		printStatus(ac);
		System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0):");
		num = sc.nextInt();
		do {
			if (num == 0)
                break;
			System.out.print("원하는 작업을 선택하세요 (1-입금/2-출금):");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.print("입금액을 입력하세요: ");
				ac[num - 1].deposit(sc.nextInt());
				System.out.println("입금이 완료되었습니다.");
				break;
			case 2 :
				System.out.print("출금액을 입력하세요: ");
				ac[num - 1].withdraw(sc.nextInt());
				System.out.println("출금이 완료되었습니다.");
				break;
			}
			printStatus(ac);
			System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0):");
			num = sc.nextInt();
		} while (num != 0);
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
	public static void printStatus(Object[] obj) {
		System.out.println("현재 잔고현황입니다.");
		System.out.println("계좌번호     계좌주     잔고");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "         ");
			System.out.println(obj[i].toString());
		}
	}
}
