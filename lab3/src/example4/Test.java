package example4;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Mananger man1=new Mananger("aaa",11.22,"12113",1);
//		man1.addEmployees(new Employee("qewer",11.00,"11111111"));
		Mananger man2=(Mananger) man1.clone();
//		man1.setSalary(0);
//		System.out.print(man2);
		HireDateComporator hComporator=new HireDateComporator();
		NameComporator nComporator=new NameComporator();
		System.out.print(nComporator.compare(man1, man2));
	}

}
