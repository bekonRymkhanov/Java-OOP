package practice3;

public class Staff extends Person{
	
	
	private String school;
	private double pay;
	
	
	public Staff() {
		super();
	}public Staff(String name,String address,String school,double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	
	
	public String getSchool() {
		return this.school;
	}public double getPay() {
		return this.pay;
	}
	
	
	public void setSchool(String school) {
		this.school=school;
	}public void setPay(double pay) {
		this.pay=pay;
	}
	
	
	public String toString() {
		return  " name:"+this.getName()+" address:"+this.getAddress()+" school:"+this.school+" pay:"+this.pay;
	}
}
