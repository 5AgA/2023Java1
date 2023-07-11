import java.util.Scanner;

public class Practice61 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
		BankAccount[] ac = new BankAccount[3];
		int num = -1, choice;
		
		for (int i = 0; i < 3; i++) {
			ac[i] = new BankAccount();
			ac[i].setOwner(sc.next());
			ac[i].setBalance(sc.nextInt());
		}
		
		do {
            printStatus(ac);
            num = sc.nextInt();
			if (num == 0)
                break;
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				ac[num - 1].deposit(sc.nextInt());
				System.out.println("입금이 완료되었습니다.");
				break;
			case 2 :
                try {
                    ac[num - 1].withdraw(sc.nextInt());
				    System.out.println("출금이 완료되었습니다.");
				    break;
                } catch (NegativeBalanceException e) {
                    System.out.println(e.getMessage());
                    break;
                }
			}
		} while (num != 0);
		System.out.println("프로그램을 종료합니다.");
		sc.close();
    }
    public static void printStatus(Object[] obj) {
		System.out.println("현재 잔고현황입니다.");
		System.out.println("계좌번호     계좌주     잔고");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "     ");
			System.out.println(obj[i].toString());
		}
        System.out.println("\n");
	}
}