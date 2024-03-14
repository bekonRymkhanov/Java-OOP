package lab2example2;

import java.util.Objects;

public class factoryWoker extends Worker{
	private int pay;
	
	public factoryWoker() {
		super();
		pay=0;
	}public factoryWoker(String name,int age,int pay){
		super(name,age);
		this.pay=pay;
	}
	
	public int getPay() {
		return this.pay;
	}public void setPay(int pay) {
		this.pay=pay;
	}
	
	public int hashCode() {
		return Objects.hash(super.getName(),super.getAge(),pay);
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		factoryWoker woker=(factoryWoker)o;
		return this.pay==woker.pay;
	}
	
	public String speak() {
		return "jdd";
	}
	
	public String toString() {
		return super.toString()+" pay: "+this.pay;
	}
	
}
