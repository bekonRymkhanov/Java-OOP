package lab2;

public class Cube extends Shapes{
	
	private int sideLenth;
	
	
	public Cube() {
		super("Cube");
		this.sideLenth=0;
	}public Cube(int sideLenth){
		super("Cube");
		this.sideLenth=sideLenth;
	}
	
	
	public int getSideLenth() {
		return this.sideLenth;
	}public void setSideLenth(int side) {
		this.sideLenth=side;
	}
	
	
	double volume() {
		return Math.pow(this.sideLenth,3);
	}

	
	double surfaceArea() {
		return 6*Math.pow(this.sideLenth,2);
	}
	
	public String toString() {
		return super.toString()+"side lenth: "+this.sideLenth;
	}

}
