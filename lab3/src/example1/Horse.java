package example1;

import java.util.Objects;

public class Horse extends Animal{
	
	private int HorsePower;
	
	public Horse() {
		super();
	}
	public Horse(String name, int age,int HorsePower) {
		super(name, age);
		this.HorsePower=HorsePower;
	}

	public int getHorsePower() {
		return HorsePower;
	}

	public void setHorsePower(int horsePower) {
		HorsePower = horsePower;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(HorsePower);
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
		Horse other = (Horse) obj;
		return HorsePower == other.HorsePower;
	}

	@Override
	public String toString() {
		return super.toString()+" HorsePower: " + HorsePower;
	}
	
	
	

}
