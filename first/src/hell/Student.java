package hell;

public class Student {
	
	private static int  id=0;
	String name;
	int age;
	private int gpa;
	private int student_id;
	{
		student_id=id++;
	}
	public Student() {
	}
	public Student(String name) {
		this();
		this.name = name;
	}
	public Student(String name, int age) {
		this(name);
		this.age = age;
	}
	public Student(String name, int age,int gpa) {
		this(name,age);
		this.gpa=gpa;
	}
	public int getId() {
		return student_id;
	}
	public String getName() {
		return this.name;
	}
	public int getGpa() {
		return this.gpa;
	}
	public void giveInfo(String name,int gpa) {
		this.name=name;
		this.gpa=gpa;
	}
	public String toString() {
		return this.name+ ", id: "+this.getId();
	}
}