package hell;
import java.util.Scanner;
public class example4 {
	static int finder(int a,int b,int c) {
		double D = Math.pow(b, 2) - 4*a*c;
		if (D<0) {
			System.out.print("D is negative");
			return 1;
		}
		double first_value=(-1*b+Math.sqrt(D))/(2*a);
		double second_value=(-1*b-Math.sqrt(D))/(2*a);
		System.out.print(first_value+" "+second_value);
		return 1;

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		finder(a,b,c);
	}
}
