package example4;

import java.util.Objects;
import java.util.Vector;

public class Mananger extends Employee implements Cloneable,Comparable<Employee>{
	
	Vector<Employee> Employees=new Vector<Employee>();
	private int bonus;
	
	public Mananger() {
		super();
	}public Mananger(String name,double salary, String insuranceNumber,int bonus) {
		super(name,salary,insuranceNumber);
		this.bonus=bonus;
	}
	public Vector<Employee> getEmployees() {
		return Employees;
	}
	public void addEmployees(Employee employees) {
		Employees.add(employees);
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Employees, bonus);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mananger other = (Mananger) obj;
		return Objects.equals(Employees, other.Employees) && bonus == other.bonus;
	}
	@Override
	public String toString() {
		return super.toString()+" Employees:" + Employees + " bonus:" + bonus;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Mananger s = (Mananger)super.clone();
		return s;

	}

	public int compareTo(Employee o) {
		if(this.getSalary()>o.getSalary()) return 1;
		if(this.getSalary()<o.getSalary()) return -1;
		Mananger m=(Mananger) o;
		if(this.bonus>m.getBonus()) return 1;
		if(this.bonus<m.getBonus()) return -1;
		return 0;
	}
	
}
