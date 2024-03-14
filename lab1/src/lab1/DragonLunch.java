package lab1;

import java.util.Vector;

import hell.Student;

public class DragonLunch {
	public int i=0;
	Vector<Person> queue=new Vector();
	
	public DragonLunch() {
		
	}
	
	public void kidnap(Person p) {
		if(this.queue.isEmpty()) {
			this.queue.add(p);
			this.i++;
		}else if(this.queue.elementAt(i-1).gender==Gender.MALE && p.gender==Gender.FEMALE) {
			this.queue.remove(i-1);
			this.i--;
		}else {
			this.queue.add(p);
			this.i++;
		}
	}
	public void willDragonEatOrNot() {
		if(this.queue.isEmpty()) {
			System.out.print("Dragon will be hungry,all couples escaped,:(");
		}else {
			System.out.print("Dragon is happy,he had a good lunch today,:(");

		}
			
	}
}
