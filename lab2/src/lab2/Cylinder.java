package lab2;

public class Cylinder extends Shapes {
	
	private int radius;
	private int height;
	
	public Cylinder() {
		super("Cylinder");
		this.radius=0;
		this.height=0;
	}public Cylinder(int radius,int height){
		super("Cylinder");
		this.radius=radius;
		this.height=height;
	}
	
	
	public int getRadius() {
		return this.radius;
	}public void setrRadius(int radius) {
		this.radius=radius;
	}public int getHeight() {
		return this.height;
	}public void setrHeight(int height) {
		this.height=height;
	}
	
	double volume() {
		return 3.1415*Math.pow(this.radius,2)*this.height;
	}
	double surfaceArea() {
		return (4*3.1415*this.radius)+(this.height*2*this.radius);
	}
	
	public String toString() {
		return super.toString()+"radius: "+this.radius+"height: "+this.height;
	}
	
}
