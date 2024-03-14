package practice6;

public class Person implements CanHavePizzaandVoice{
	private int Balance;

	public Person(int Balance) {
		this.Balance=Balance;
	}
	
	@Override
	public void eatPizza() {
		System.out.print("    mmmm.delicious   ");
	}
	public void Pay(int Price) {
		this.Balance-=Price;
		if(this.Balance<0) {
			System.out.print("   im in dept    ");
		}
	}

	@Override
	public void voiceAfterEating() {
		System.out.print("    hamamma,im gonna pay   ");
	}

	@Override
	public void speak() {
		System.out.print("   hello my name is something   ");
	}

}
