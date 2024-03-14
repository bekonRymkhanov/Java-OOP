package practice3;

public class Animal {
	
	public int numOfLegs;
	public String name;
	public Animal() {
		this.numOfLegs=4;
		name="";
	}
	public Animal(int numOfLegs) {
		name="";
		this.numOfLegs=numOfLegs;
	}
	public Animal(String name) {
		this.name=name;
	}
	public Animal(String name,int numOfLegs) {
		this.numOfLegs=numOfLegs;
		this.name=name;
	}
	
	public String chillTime() {
		return "20 minutes";
	}
	
	
	
}
