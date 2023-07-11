
public class BankAccount {
	private String owner;
	private int balance;
	private int id;
	
	public BankAccount() { this("모름", -1, -1); }
	public BankAccount(String owner, int balance, int id) {
		setOwner(owner); setBalance(balance); setId(id);
	}
	
	public void setOwner(String owner) { this.owner = owner; }
	public void setBalance (int balance) { this.balance = balance; }
	public void setId(int id) { this.id = id; }
	public String getOwner() { return owner; }
	public int getBalance() { return balance; }
	public int getId() { return id; }
	
	public String toString() {
		String ret = "";
		ret += getId() + "\t";
		ret += getOwner() + "\t";
		ret += getBalance();
		return ret;
	}
	public void deposit(int money) {
		setBalance(this.balance + money);
	}
	public void withdraw(int money) {
		setBalance(this.balance - money);
	}
}
