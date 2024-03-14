package hell;
import java.util.Scanner;
public class example2 {
	static double area(double a) {
		return Math.pow(a,2);
	}
	static int perimetr(int a) {
		return a*4;
	}
	static double diagonal_length(double a) {
		double b = Math.sqrt(2*(Math.pow(a, 2)));
		return b;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		System.out.print(area(length)+"\n"+perimetr(length)+"\n"+diagonal_length(length));
	}
}
