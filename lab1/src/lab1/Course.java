package lab1;

import java.util.Vector;

public class Course {
	public String name;
	public String description;
	public int numOfCredits;
	Vector<String> prereguisite=new Vector<String>();
	
	public Course() {
		
	}

	public void CourseInfo(String name,String description,int numOfCredits) {
		this.name=name;
		this.description=description;
		this.numOfCredits=numOfCredits;
	}
	
	public void givePre(String prere) {
		this.prereguisite.add(prere);
	}
	
	public String toString() {
		return this.name+" "+this.description+" "+this.numOfCredits+" "+this.prereguisite;
	}
}
