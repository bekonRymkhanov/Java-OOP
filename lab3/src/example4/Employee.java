package example4;

import java.util.Date;
import java.util.Objects;
import java.util.jar.Attributes.Name;

abstract class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	public Employee() {
	}
	public Employee(String name,double salary, String insuranceNumber) {
		this,name=name;
		this.salary = salary;
		this.hireDate =new Date();
		this.insuranceNumber = insuranceNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hireDate, insuranceNumber, salary);
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
		Employee other = (Employee) obj;
		return Objects.equals(hireDate, other.hireDate) && Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "name:"+ name +" salary:" + salary + " hireDate:" + hireDate + " insuranceNumber:" + insuranceNumber;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getSalary()>o.getSalary()) return 1;
		if(this.getSalary()<o.getSalary()) return -1;
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee s = (Employee)super.clone();
		s.hireDate = (Date)hireDate.clone();
		return s;

	}
	
	
}
