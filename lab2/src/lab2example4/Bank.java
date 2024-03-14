package lab2example4;

import java.util.Scanner;
import java.util.Vector;

public class Bank{
	Vector<Account> database=new Vector<Account>();
	
	public Bank() {
	}
	
    public void oppeningCheckingAccaunt(int accNumber) {
		database.add(new CheckingAccount(accNumber));
	}public void oppeningSavingAccaunt(int accNumber) {
		database.add(new SavingAccount(accNumber));
	}
	
	public void closingAccount(int accNumber) {
		for(Account acc:database) {
			if(acc.getAccountNumber()==accNumber) {
				database.remove(acc);
			}
		}
	}
	public void updateDeposite(int accNumber) {
		Scanner scan=new Scanner(System.in);
		String Action=scan.next();
		if(Action.equals("deposit")) {
			int value=scan.nextInt();
			for(Account acc:database) {
				if(acc.getAccountNumber()==accNumber) {
					if(acc instanceof SavingAccount) {
						SavingAccount save=(SavingAccount) acc;
						save.deposit(value);
					}else {
						CheckingAccount check=(CheckingAccount) acc;
						check.deposit(value);
					}
				}
			}
		}else if(Action.equals("withdraw")) {
			int value=scan.nextInt();
			for(Account acc:database) {
				if(acc.getAccountNumber()==accNumber) {
					if(acc instanceof SavingAccount) {
						SavingAccount save=(SavingAccount) acc;
						save.withdraw(value);
					}else {
						CheckingAccount check=(CheckingAccount) acc;
						check.withdraw(value);
					}
				}
			}
		}else {
			int number2=scan.nextInt();
			int value=scan.nextInt();
			for(Account acc:database) {
				if(acc.getAccountNumber()==accNumber) {
					for(Account ac:database) {
						if(ac.getAccountNumber()==number2) {
							acc.transfer(value, ac);
						}
					}
				}
				}
			}
		for(Account acc: database) {
			if(acc instanceof SavingAccount) {
				SavingAccount save=(SavingAccount) acc;
				save.addMonthlyInterest();
			}
		}
	}
}
