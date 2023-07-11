import java.util.Scanner;

public class Practice62 {
    public static void main(String[] args) {
		// 여기에 필요한 코드를 작성하세요.
        Scanner sc = new Scanner(System.in);
		int num = -1, choice, n;
		System.out.print("계좌의 개수를 입력하세요: ");
        n = sc.nextInt();
        BankAccount[] ac = new BankAccount[n];
		
        System.out.println("");
		getAccInfo(sc, ac);
		
		do {
                printAccInfo(ac);
            try {
                num = getAccNum(sc, ac);
                if (num == 0) break;
                choice = getOperationNum(sc);
			switch(choice) {
			case 1 :
					System.out.print("입금액을 입력하세요: ");
                    int m = sc.nextInt(); 
                    ac[num - 1].deposit(m);
				    System.out.println("입금이 완료되었습니다.");
				    break;
				
			case 2 :
					System.out.print("출금액을 입력하세요: ");
                    m = sc.nextInt();
                    ac[num - 1].withdraw(m);
				    System.out.println("출금이 완료되었습니다.");
				    break;
				}
            } catch (NoSuchAccountException e) {
            	System.out.println(e.getMessage()); 
            } catch (NoSuchOperationException e) {
            	System.out.println(e.getMessage());
            } catch (NegativeBalanceException e) {
            	System.out.println(e.getMessage());
            }
		} while (num != 0);
		System.out.println("프로그램을 종료합니다.");
		sc.close();
    }
    private static void getAccInfo(Scanner scan, BankAccount[] ba) {
        
    	
        for (int i = 0; i < ba.length; i++) {
        	System.out.print("예금주 이름을 입력하세요: ");
        	String name = scan.next();
        	System.out.print("잔고를 입력하세요: ");
        	int balance = scan.nextInt();
            ba[i] = new BankAccount(name, balance);
        }
    }
    private static void printAccInfo(BankAccount[] ba) {
        System.out.println("\n현재 잔고현황입니다.");
		System.out.println("계좌번호     계좌주     잔고");
		for (int i = 0; i < ba.length; i++) {
			System.out.print((i + 1) + "     ");
			System.out.println(ba[i].toString());
		}
    }
    private static int getAccNum(Scanner scan, BankAccount[] ba) throws NoSuchAccountException {
        System.out.print("업데이트할 계좌번호를 입력하세요(종료-0): ");
    	int num = scan.nextInt();
        if (num - 1 >= ba.length)
            throw (new NoSuchAccountException());
        return num;
    }
    private static int getOperationNum (Scanner scan) throws NoSuchOperationException {
    	System.out.print("원하는 작업을 선택하세요(1-입금/2-출금): ");
        int op = scan.nextInt();
        if (op != 1 && op != 2)
            throw (new NoSuchOperationException());
        return op;
    }
}