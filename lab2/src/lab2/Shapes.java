package lab2;

public abstract class Shapes {
	
	private String name;
	
	
	public Shapes() {
		this.name="";
	}public Shapes(String name){
		this.name=name;
	}
	
	
	public String getName() {
		return this.name;
	}public void setName(String name) {
		this.name=name;
	}
	
	abstract double volume();
	abstract double surfaceArea();
	
	public String toString() {
		return "name: "+this.name;
	}
	
}

