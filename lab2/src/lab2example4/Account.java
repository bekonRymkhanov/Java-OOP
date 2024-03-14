package lab2example4;

public class Account{
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance=0.0;
		accNumber=a;
	}
	
	public void deposit(double sum) {	
		this.balance+=sum;
	}
	
	public void withdraw(double sum) {
		this.balance-=sum;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccountNumber() {
		return this.accNumber;
	}
	
	public void transfer(double amount,Account acc) {
	}
	
	public String toString() {
		return "accountNumber: "+this.accNumber+" balance: "+this.balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
