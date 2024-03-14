package lab2example2;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<factoryWoker> set=new HashSet<>();
		factoryWoker w1=new factoryWoker("ali",15,100);
		factoryWoker w2=new factoryWoker("hanty",20,200);
		factoryWoker w3=new factoryWoker("hanty",20,200);
		factoryWoker w4=new factoryWoker("azamat",18,400);


		set.add(w1);
		set.add(w2);
		set.add(w3);
		for(factoryWoker i:set) {
			if(i.equals(w2)) {
				System.out.print("he is ill ");
			}
			System.out.print(i.hashCode()+"  ");
		}
		System.out.print(set);

	}

}
