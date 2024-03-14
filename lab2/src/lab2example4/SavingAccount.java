package lab2example4;

public class SavingAccount extends Account{

	private double interestRate;
	
	public SavingAccount(int a) {
		super(a);
		this.interestRate = 1.1;
	}
	
	public void withdraw(double sum) {
		if(super.getBalance()>=sum) {
		 super.withdraw(sum);
		}else {
			System.out.print("you dont have enough currency in your deposite!");
		}
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
	}
	
	public void transfer(double amount,Account acc) {
		if(acc instanceof SavingAccount) {
			SavingAccount account=(SavingAccount)acc;
			if(super.getBalance()>=amount) {
				account.deposit(amount);
				this.withdraw(amount);
			}else {
				this.withdraw(amount);
			}
		}
	}
	
	public void addMonthlyInterest() {
		super.deposit(super.getBalance()*(this.interestRate-1)/100);
	}
	
	public String toString() {
		return super.toString()+" interestRate: "+this.interestRate;
	}
}
