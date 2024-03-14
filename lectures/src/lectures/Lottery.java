package lectures;

import java.io.Serializable;
import java.util.Vector;

public class Lottery implements Serializable{
	private String name;
	private int idOfPerson;
	

	public Lottery() {
	}
	
	
	Vector<String> set=new Vector<>();
	
	public String toString() {
		return this.name+" "+this.idOfPerson+" set:"+this.set;
	}
	
}
