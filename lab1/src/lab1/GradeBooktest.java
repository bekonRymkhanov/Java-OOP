package lab1;

import java.util.Scanner;

import hell.Student;

public class GradeBooktest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Gradebook Gra=new Gradebook();
		System.out.print("write name of course,description,credits:\n");
		String namecourse=scan.next();
		String descriptioncourse=scan.next();
		int credits=scan.nextInt();
		Gra.giveCourse(namecourse, descriptioncourse, credits);
		
		
		Gra.displayMessage();
		String name=scan.next();
		int gpa=scan.nextInt();
		Student s=new Student(name,18,gpa);
		Gra.getStudent(s);
		String name2=scan.next();
		int gpa2=scan.nextInt();
		Student f=new Student(name2,18,gpa2);
		Gra.getStudent(f);
		String name3=scan.next();
		int gpa3=scan.nextInt();
		Student g=new Student(name3,18,gpa3);
		Gra.getStudent(g);
		String name4=scan.next();
		int gpa4=scan.nextInt();
		Student h=new Student(name4,18,gpa4);
		Gra.getStudent(h);
		String name5=scan.next();
		int gpa5=scan.nextInt();
		Student j=new Student(name5,18,gpa5);
		Gra.getStudent(j);
		Gra.displayGradeReport();
		Gra.outputBarChart();
		
	}
}
