package lab2example4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Bank b=new Bank();
		b.oppeningSavingAccaunt(123);
		b.oppeningSavingAccaunt(122);
		b.oppeningCheckingAccaunt(121);
		b.oppeningCheckingAccaunt(120);

		while(true) {
			int number=scan.nextInt();
			b.updateDeposite(number);
			System.out.print(b.database);
		}
	}

}
