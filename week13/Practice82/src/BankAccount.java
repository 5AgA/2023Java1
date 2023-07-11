
public class BankAccount {
	private int acNumber;
	private String owner;
	private int balance;
	
	public BankAccount() { this(-1, "모름", -1); }
	public BankAccount(int acNumber, String owner, int balance) {
		setAcNumber(acNumber); setOwner(owner); setBalance(balance);
	}
	
	public void setAcNumber (int acNumber) { this.acNumber = acNumber; }
	public void setOwner(String owner) { this.owner = owner; }
	public void setBalance (int balance) { this.balance = balance; }
	public int getAcNumber () { return acNumber; }
	public String getOwner() { return owner; }
	public int getBalance() { return balance; }
	
	public String toString() {
		String ret = "";
		ret += getAcNumber() + "\t";
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
