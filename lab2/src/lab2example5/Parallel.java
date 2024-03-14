package lab2example5;

public class Parallel extends Circuit{
	
	public double V=0;
	public double R;
	
	public Parallel(Circuit a,Circuit b) {
		this.V=a.getPotentialDiff();
		this.R=1/((1/a.getResistance())+(1/b.getResistance()));
	}
	@Override
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
