import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Practice81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int task;
		System.out.print("원하시는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무):");
		task = sc.nextInt();
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
			
		while (task != 0) {
			switch(task) {
			case 1: 
				System.out.print("파일 이름을 입력하세요:");
				String fname = sc.next();
				load(fname, list);
				break;
			case 2:
				System.out.print("파일 이름을 입력하세요:");
				fname = sc.next();
				save(fname, list);
				break;
			case 3:
				System.out.print("업데이트할 계좌번호를 입력하세요:");
				int id = sc.nextInt();
				int index = 0;
				for (int i = 0; i < list.size(); i++) 
					if (list.get(i).getId() == id)
						index = i;
				System.out.print("원하는 계좌 작업을 선택하세요(1-입금/2-출금):");
				int acTask = sc.nextInt();
				if (acTask == 1) {
					System.out.print("입금액을 입력하세요:");
					list.get(index).deposit(sc.nextInt());
					System.out.println("입금이 완료되었습니다.");
				}
				else if (acTask == 2) {
					System.out.print("출금액을 입력하세요:");
					list.get(index).withdraw(sc.nextInt());
					System.out.println("출금이 완료되었습니다.");
				}
				break;
			}
			System.out.println("\n현재 잔고 현황입니다");
			System.out.println("계좌번호\t계좌주\t  잔고");
			for (BankAccount ba : list) {
				System.out.println(ba.getId() + "\t\t" + ba.getOwner() + "\t  " + ba.getBalance());
			}
			System.out.print("\n원하시는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무):");
			task = sc.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	public static void load(String fname, ArrayList<BankAccount> list) {
		try {
			Scanner scan = new Scanner(new FileReader(fname));
			int id, balance;
			String owner;
			list.removeAll(list);
			while (scan.hasNext()) {
				id = scan.nextInt();
				owner = scan.next();
				balance = scan.nextInt();
				BankAccount ba = new BankAccount(owner, balance, id);
				list.add(ba);
			}

			if (scan != null) {
				scan.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void save(String fname, ArrayList<BankAccount> list) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fname));

			for (int i = 0; i < list.size(); i++)
				pw.println(list.get(i).toString());

			if (pw != null)
				pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
