package lab1;

import java.util.Scanner;

public class lab12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		class12 c =new class12(5);
		
		c.getinfo(Gender.MALE,"beka");
		
		System.out.print(class12.course+" "+c.gender+" "+class12.canFly);
	}

}
