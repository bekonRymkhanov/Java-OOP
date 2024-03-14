package example5;
import hell.Time;
public class Chocolate implements Comparable<Chocolate>{
	
	private double weight;
	private String name;
	
	
	public Chocolate(double weight, String name) {
		super();
		this.weight = weight;
		this.name = name;
	}

	@Override
	public String toString() {
		return " weight:" + weight + " name:" + name;
	}

	@Override
	public int compareTo(Chocolate o) {
		if(this.weight>o.weight) return 1;
		if(this.weight<o.weight) return -1;
		return 0;
	}
}
	