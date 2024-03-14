package lab1;

import java.util.Scanner;

public class lab15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DragonLunch Dragon=new DragonLunch();
		
		System.out.println("how many students dragon kidnapped:");
		int quantity=scan.nextInt();
		
		for(int i=0;i<quantity;i++) {
			System.out.println("MALE or FEMALE?:");
			String genderOfKidnapped=scan.next();
			
			if(genderOfKidnapped.equals("MALE")) {
				Person p=new Person(Gender.MALE);
				Dragon.kidnap(p);
			}
			else {
				Person p=new Person(Gender.FEMALE);
				Dragon.kidnap(p);
			}
		}
		Dragon.willDragonEatOrNot();
	}

}
