package hell;
import java.util.Scanner;
public class example3 {
	static String grading(double grade) {
		if(grade>=95) {
			return "A";
			
		}
		else if(grade>=90) {
			return "-A";
		}
		else if (grade>=85) {
			return "B+";
		}
		else if (grade>=80) {
			return "B";
		}
		else if(grade>=75) {
			return "-B";
		}else if(grade>=70) {
			return "C+";
		}
		else if(grade>=65) {
			return "C";
		}
		else if(grade>=60) {
			return "-C";
		}
		else if (grade>=55) {
			return "D+";
		}
		else if (grade>=50) {
			return "D";
		}
		else {
			return "F";
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double score=scan.nextDouble();
		System.out.print(grading(score));
	}
}
