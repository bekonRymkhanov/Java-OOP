package practice6;

public class Cat implements CanHavePizzaandVoice{
	private String name;

	public void eatPizza() {
		System.out.print("    hhmhmhmhmhmhm ");

	}

	@Override
	public void voiceAfterEating() {
		System.out.print("    myau myau ,delicious   ");
	}

	@Override
	public void speak() {
		System.out.print(" hello...something in cat language   ");
	}

	
}
