package lab2example4;

public class CheckingAccount extends Account{
	
	private int numberOfTransactions;
	public final int NUM_FREE_TRANSACTIONS=3;
	
	public CheckingAccount(int a) {
		super(a);
		this.numberOfTransactions=0;
	}
	
	public void withdraw(double sum) {
		if(super.getBalance()>=sum) {
			super.withdraw(sum);
			this.numberOfTransactions++;
			if(this.numberOfTransactions>this.NUM_FREE_TRANSACTIONS) {
				this.deductFee();
			}
		}else {
			System.out.print("you dont have enough currency in your deposite!");
		}
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		this.numberOfTransactions++;
		if(this.numberOfTransactions>this.NUM_FREE_TRANSACTIONS) {
			this.deductFee();
		}
	}
	
	public void transfer(double amount,Account acc) {
		if(acc instanceof SavingAccount) {
			CheckingAccount account=(CheckingAccount)acc;
			if(super.getBalance()>=amount) {
				account.deposit(amount);
				this.withdraw(amount);
			}else {
				this.withdraw(amount);
			}
		}
	}
	
	public void deductFee() {
		if(super.getBalance()>0.02) {
			super.withdraw(0.02);
		}
	}
	
	public String toString() {
		return super.toString()+" numOfTransactions:"+this.numberOfTransactions+" MAX_NUM:"+this.NUM_FREE_TRANSACTIONS;
	}

}
