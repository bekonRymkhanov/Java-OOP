package lab2example5;

public class Test {

	public static void main(String[] args) {
		Circuit a=new Resistor(3.00);
		a.applyPotentialDiff(4.00);
		Circuit b=new Resistor(3.00);
		b.applyPotentialDiff(4.00);
		Circuit c=new Parallel(a,b);
		Circuit d=new Series(a,b);
		System.out.println(c.getResistance());
		System.out.println(c.getCurrent());
		System.out.println(c.getPotentialDiff());
		System.out.println(c.getPower());
		System.out.println(d.getResistance());
		System.out.println(d.getCurrent());
		System.out.println(d.getPotentialDiff());
		System.out.println(d.getPower());

	}

}
