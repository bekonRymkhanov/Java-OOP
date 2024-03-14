package practice3;

public class Person {
	
	
	private String name;
	private String address;
	
	
	public Person() {
		name="stranger";
		address="unknown";
	}public Person(String name) {
		this.name=name;
		address="unknown";
	}public Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	
	public String getName() {
		return this.name;
	}public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String toString() {
		return " name:"+this.name+" address:"+this.address;
	}
}
