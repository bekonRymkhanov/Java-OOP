package lab1;
public class Person {
	Gender gender;
	public Person() {
		
	}
	public Person(Gender gender) {
		this.gender=gender;
	}
	public String toString() {
		return ""+this.gender;
	}
}
