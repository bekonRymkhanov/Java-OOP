package hell;
import java.util.Scanner;
public class example6 {
	static boolean is_palindrome(String word) {
		
		for(int i=0;i<word.length()/2;i++) {
			if (word.charAt(i)!=word.charAt(word.length()-i-1)) {
				return false;
			}
		}return true;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		if(is_palindrome(word)) {
			System.out.print("yes");
		}else {
			System.out.print("no");

		}
	}
}
