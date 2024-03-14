package practice3;

import java.util.Scanner;
import java.util.Vector;

public class test3ofthem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Vector<Person> persons=new Vector();
		int i=0;
		while(true) {
			System.out.print("add or print?");
			String action=scan.next();
			if(action.equals("add")) {
				System.out.print("Stud?stuff?person?");
				String type=scan.next();
				System.out.print("NAME:");
				String name=scan.next();
				System.out.print("ADDRESS:");
				String address=scan.next();
	
				if(type.equals("stud")) {
					System.out.print("PROGRAM:");
					String program=scan.next();
					System.out.print("YEAR:");
					int year=scan.nextInt();
					System.out.print("FEE:");
					double fee=scan.nextDouble();
					persons.add(i, new Student(name,address,program,year,fee));
				}else if(type.equals("stuff")) {
					System.out.print("SCHOOL:");
					String school=scan.next();
					System.out.print("PAY:");
					double pay=scan.nextDouble();
					persons.add(i,new Staff(name,address,school,pay));
				}else {
					persons.add(i,new Person(name,address));
				}
				i++;
			}else{
				for(int j=0;j<i;j++) {
					System.out.print(persons.get(j).toString()+" \n");
				}
			}
			
		}

	}
	

}
