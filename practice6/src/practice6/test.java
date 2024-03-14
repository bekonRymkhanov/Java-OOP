package practice6;

public class test {

	public static void main(String[] args) {
		CanHavePizzaandVoice cat1=new Cat();
		Restourant res1=new Restourant();
		CanHavePizzaandVoice pers1=new Person(10000);
		res1.servePizza(cat1);
	}

}
