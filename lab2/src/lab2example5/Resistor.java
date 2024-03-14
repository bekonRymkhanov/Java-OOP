package lab2example5;

public class Resistor extends Circuit{
	
	private double R;
	private double V=0;

	public Resistor(double R) {
		this.R=R;
	}
	
	public double getResistance() {
		return R;
	}

	public double getPotentialDiff() {
		return V;
	}

	public void applyPotentialDiff(double V) {
		this.V=V;
	}
	public String toString() {
		return super.toString();
	}

}
