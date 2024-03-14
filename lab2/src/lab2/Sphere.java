
package lab2;

public class Sphere extends Shapes{
	
	private int radius;
	
	
	public Sphere() {
		super("Sphere");
		this.radius=0;
	}public Sphere(int radius){
		super("Sphere");
		this.radius=radius;
	}
	
	
	public int getRadius() {
		return this.radius;
	}public void setrRadius(int radius) {
		this.radius=radius;
	}
	
	double volume() {
		return (4*3.1415/3)*Math.pow(this.radius,3);
	}
	double surfaceArea() {
		return 4*3.1415*Math.pow(this.radius,2);
	}
	
	public String toString() {
		return super.toString()+"radius: "+this.radius;
	}
	
}
