import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Practice81 {

	public static void main(String[] args) {
		ArrayList<BankAccount> ba = new ArrayList<BankAccount>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하시는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무):");
		int t = sc.nextInt();
		while (t != 0) {
			switch (t) {
			case 1:
				System.out.print("파일 이름을 입력하세요:");
				load(sc.next(), ba);
				break;
			case 2:
				System.out.print("파일 이름을 입력하세요:");
				try {
					PrintWriter pw = new PrintWriter(new FileWriter(sc.next()));
					for (BankAccount ac : ba) {
						pw.println(ac.toString());
					}
					System.out.println("잔고현황이 성공적으로 저장되었습니다.");
					if (pw != null) {
						pw.close();
					}
				} catch (IOException e) {
					System.out.println("파일을 저장할 수 없습니다.");
				}
				break;
			case 3:
				System.out.print("업데이트할 계좌번호를 입력하세요:");
				int acc = sc.nextInt() - 1;
				System.out.print("원하는 계좌 작업을 선택하세요 (1-입금/2-출금):");
				int at = sc.nextInt();
				if (at == 1) {
					System.out.print("입금액을 입력하세요:");
					ba.get(acc).deposit(sc.nextInt());
					System.out.println("입금이 완료되었습니다.");
				}
				else if (at == 2) {
					System.out.print("출금액을 입력하세요:");
					ba.get(acc).withdraw(sc.nextInt());
					System.out.println("출금이 완료되었습니다.");
				}
				break;
			}
			System.out.println("\n현재 잔고현황입니다");
			System.out.println("계좌번호\t계좌주\t잔고");
			for (BankAccount ac : ba) {
				System.out.println(ac.toString());
			}
			System.out.print("\n원하시는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무):");
			t = sc.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	public static void load(String fname, ArrayList<BankAccount> list) {
		
		try {
			Scanner scan = new Scanner(new FileReader(fname));
			
			list.removeAll(list);
			while (scan.hasNext()) {
				int i = scan.nextInt();
				String owner = scan.next();
				int balance = scan.nextInt();
				BankAccount b = new BankAccount(i, owner, balance);
				list.add(b);
			}
			if (scan != null) {
				scan.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}
