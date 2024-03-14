package practice6;

public class Restourant {
	public int PizzaPrice=100;
	
	public void servePizza(CanHavePizzaandVoice a) {
		a.speak();
		a.eatPizza();
		if(a instanceof Person) {
			
			Person p=(Person) a;
			p.voiceAfterEating();
		    p.Pay(PizzaPrice);
		}else {
			a.voiceAfterEating();
		}
	}
	
}
