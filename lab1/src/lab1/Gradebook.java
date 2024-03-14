package lab1;
import java.util.Vector;
import hell.Student;
public class Gradebook {
	Course course=new Course();
	public double totalGrade;
	private int maximalGpa=0;
	private int maximalGpaIndex;
	private int minimalGpa=100;
	private int minimalGpaIndex;
	int i=0;
	
	Vector<Student> listOfStudents = new Vector<Student>();
	
	public Gradebook() {
	}
	
	public void giveCourse(String name,String description,int numOfCredits) {
		course.CourseInfo(name, description, numOfCredits);
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for "+this.course.name+"!\n\n"+"Please, input five students:");
		System.out.print("input name and grade:\n");
	}
	
	public void getStudent(Student a) {
		this.totalGrade+=a.getGpa();
		if(a.getGpa()>this.maximalGpa) {
			this.maximalGpa=a.getGpa();
			this.maximalGpaIndex=i;
		}if(a.getGpa()<this.minimalGpa) {
			this.minimalGpa=a.getGpa();
			this.minimalGpaIndex=i;
		}
		i++;
		listOfStudents.add(a);
	}
	
	public void displayGradeReport() {
		System.out.print("Class avarage is "+(this.totalGrade/this.i)+". lowest grade is "+this.minimalGpa+" ( "+this.listOfStudents.elementAt(this.minimalGpaIndex).toString()+")."+"\n"+"Hightest grade is "+this.maximalGpa+" ( "+this.listOfStudents.elementAt(this.maximalGpaIndex).toString()+")\n");
	}
	
	public void outputBarChart() {
		System.out.println("grades distribution");
        for(int j=0;j<100;j+=10) {
        	System.out.print("\n"+j+"-"+(j+9)+": ");
            for (Student i : this.listOfStudents) {
                if(i.getGpa()>=j && i.getGpa()<(j+10)) {
                	System.out.print('*');
                }
            }
        }
		
	}
	
	public String toString() {
		return this.totalGrade+" "+this.minimalGpa+" "+this.listOfStudents+" "+this.maximalGpa+" "+this.i;
	}
	
	
}
