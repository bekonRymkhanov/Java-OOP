package lab2example5;

public class Series extends Circuit{
	
	 public double R;
	 public double V=0;
	
	public Series(Circuit a,Circuit b) {
		this.R=a.getResistance()+b.getResistance();
		this.V=a.getPotentialDiff()+b.getPotentialDiff();
	}
	public double getResistance() {
		return R;
	}

	@Override
	public double getPotentialDiff() {
		return V;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.V=V;
	}
	public String toString() {
		return super.toString();
	}

}
