package ratan_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail_regEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mail id");
		String mailId = scan.next();
		Pattern p = Pattern.compile("([a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]*([.][a-zA-Z]+)+)");
		Matcher m = p.matcher(mailId);
		if(m.find()&&m.group().equals(mailId)) {
			
			System.out.println("Valid Email Id");
			
		}else {
			System.out.println("Invalid Email Id");
		}
		

	}

}
