package example1;

import java.util.Objects;

public class Duck extends Animal implements CanSwim,CanFly{
	private int NumberOfTeeth;
	
	public Duck() {
	}
	public Duck(String name, int age,int NumberOfTeeth) {
		super(name, age);
		this.NumberOfTeeth=NumberOfTeeth;
	}
	
	public int getNumberOfTeeth() {
		return NumberOfTeeth;
	}
	public void setNumberOfTeeth(int numberOfTeeth) {
		NumberOfTeeth = numberOfTeeth;
	}


	@Override
	public void Fly() {
		System.out.print("  Yeeeeeee  im flying!!! ");
	}
	@Override
	public void swim() {
		System.out.print("  Yeeeeeee  im swimming!!! ");		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(NumberOfTeeth);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Duck other = (Duck) obj;
		return NumberOfTeeth == other.NumberOfTeeth;
	}

	@Override
	public String toString() {
		return super.toString()+" NumberOfTeeth: " + NumberOfTeeth;
	}
	
	
	

}
