package lectures;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Lottery lot=new Lottery();
		Scanner scan=new Scanner(System.in);
		System.out.print("number of money prizes");
		int size=scan.nextInt();
		System.out.print("Print prizes");
		for(int i=0;i<size;i++) {
			String prize=scan.next();
			lot.set.add(prize);
		}
		System.out.print("print probability of lost");
		int nuls=scan.nextInt();
		nuls*=lot.set.size();
		for(int i=0;i<nuls;i++) {
			lot.set.add("nothing!!!");
		}
		System.out.print("tries:");
		int tries=scan.nextInt();
		Random random = new Random();
		int randomInt;
		for(int i=0;i<tries;i++) {
			System.out.print(i+" try:,");
	        randomInt = random.nextInt(lot.set.size());
			System.out.println("number is......... "+randomInt+" "+i+" try:");
			System.out.print("you won :"+lot.set.elementAt(randomInt));
			lot.set.remove(randomInt);
			

		}

		
	}

}
