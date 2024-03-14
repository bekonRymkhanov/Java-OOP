package lab1;

public class class12 {
	static int course;
	private String name;
	private int id;
	private static int idnext=0;
	Gender gender;
	final static boolean canFly=false;
	
	{
		id=idnext++;
	}
	public class12(){
	}
	public class12(int course) {
		this();
		class12.course=course;
	}
	public void getinfo(Gender gender) {
		this.gender=gender;
	}
	public void getinfo(Gender gender,String name) {
		this.getinfo(gender);
		this.name=name;
	}
	
}
