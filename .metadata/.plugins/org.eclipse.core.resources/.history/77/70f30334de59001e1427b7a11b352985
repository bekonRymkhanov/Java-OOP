package lab1;

import java.util.Scanner;

public class lab11 {

	public static void main(String[] args) {
		int i=0;
		Data11 d=new Data11();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("Enter number(Q to quit):");
			String action=sc.next();
			if(action.equals("Q")) {
				break;
			}else {
				d.plus(Integer.valueOf(action));
				i++;
			}
		}
		System.out.println("Avarage = "+d.avarage(i));
		System.out.println("Maximum = "+d.maximum());

		
	}
}
