package AtmInterface;

public class Atm {
	
	private double balance;
	private double depositeAmount;
	private double withdrawAmount;
	//default  constructor
	public Atm(){
		
	}
	//getter setter 
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	
}
