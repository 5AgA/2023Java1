
public class BankAccount {
	private String owner;
	private int balance;
	
	public BankAccount() { this("모름", -1); }
	public BankAccount(String owner, int balance) {
		setOwner(owner); setBalance(balance);
	}
	
	public void setOwner(String owner) { this.owner = owner; }
	public void setBalance (int balance) { this.balance = balance; }
	public String getOwner() { return owner; }
	public int getBalance() { return balance; }
	
	public String toString() {
		String ret = "";
		ret += getOwner() + "     ";
		ret += getBalance();
		return ret;
	}
	public void deposit(int money) throws NegativeBalanceException {
        if (money < 0)
            throw (new NegativeBalanceException());
		setBalance(this.balance + money);
	}
	public void withdraw(int money) throws NegativeBalanceException {
        if (money > balance || money < 0)
            throw (new NegativeBalanceException());
        setBalance(this.balance - money);
	}
}

// 여기에 사용자 예외를 정의하세요. 
@SuppressWarnings("serial")

class NoSuchAccountException extends Exception {
    public NoSuchAccountException() {
        super("잘못된 계좌번호 입니다. 다시 입력하세요.");
    }
}

@SuppressWarnings("serial")

class NoSuchOperationException extends Exception {
    public NoSuchOperationException() {
        super("잘못된 작업입니다. 다시 입력하세요.");
    }
}

@SuppressWarnings("serial")

class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {
        super("입력된 금액이 잘못되었습니다. 다시 입력하세요.");
    }
}