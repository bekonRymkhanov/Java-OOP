package hell;
import java.util.Scanner;
public class example5 {
	public static void main(String[] args) {
		double saving_account=100.00;
		double interest =2.5;
		Scanner scan=new Scanner(System.in);
		System.out.print("your balance is:"+saving_account);

		System.out.print("add interest?(type 1)");
		int choise=scan.nextInt();
		if (choise==1) {
			saving_account+=saving_account*2.5/100;
		}
		System.out.print("your balance is:"+saving_account);

	}
}
