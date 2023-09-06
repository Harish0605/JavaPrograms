package ratan_java;
import java.util.Scanner;
import java.util.regex.*;

public class ValidMobile_RegEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		String mobileNum = scan.next();
		Pattern p = Pattern.compile("(0|91)?([7-9][0-9]{9})");
		Matcher m = p.matcher(mobileNum);
		if(m.find()&&m.group().equals(mobileNum)) {
			
			System.out.println("Valid Mobile number");
			
		}else {
			System.out.println("Invalid Mobile number");
		}
		

	}

}
