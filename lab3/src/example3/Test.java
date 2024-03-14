package example3;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		SomeCollection some=new SomeCollection(10);
		some.add(3);
		some.add(6);
		some.add(9);
		some.delete(0);
//		some.clear();
		if(some.contains(11)) System.out.print("yeah,11");

		
		for(int i=0;i<some.size();i++) {
			System.out.print(some.elementAt(i)+" ");
		}
	}

}
