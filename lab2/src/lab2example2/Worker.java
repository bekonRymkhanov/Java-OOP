package lab2example2;

import java.util.Objects;

public class Worker {
	private String name;
	private int age;
	
	public Worker() {
	}public Worker(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}public int getAge() {
		return this.age;
	}public void setName(String name) {
		this.name=name;
	}public void setAge(int age) {
		this.age=age;
	}
	
	public boolean equals(Object o) {
		   if (this == o) return true;
		   if (o == null || getClass() != o.getClass()) return false;
		   Worker man = (Worker) o;
		   return this.age== man.age && this.name.equals(man.getName());
		}
	public int hashCode() {
		   return Objects.hash(name,age);
		}
	public String speak() {
		return "addd";
	}
	
	public String toString() {
		return " name: "+this.name+" age: "+this.age;
	}
	
}
