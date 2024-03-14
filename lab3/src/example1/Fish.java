package example1;

import java.util.Objects;

public class Fish extends Animal implements CanSwim{
	private int SwimSpeed;

	public Fish() {
	}
	public Fish(String name, int age,int SwimSpeed) {
		super(name, age);
		this.SwimSpeed=SwimSpeed;
	}
	
	public int getSwimSpeed() {
		return SwimSpeed;
	}
	public void setSwimSpeed(int swimSpeed) {
		SwimSpeed = swimSpeed;
	}

	@Override
	public void swim() {
		System.out.print("  Yeeeeeee  im swimming!!! ");		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(SwimSpeed);
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
		Fish other = (Fish) obj;
		return SwimSpeed == other.SwimSpeed;
	}

	@Override
	public String toString() {
		return super.toString()+" SwimSpeed: " + SwimSpeed;
	}
	
	
	
	
}
