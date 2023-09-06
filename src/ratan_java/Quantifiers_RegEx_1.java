package ratan_java;
import java.util.regex.*;


public class Quantifiers_RegEx_1 {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("a"); // Number of occurances of exactly 1 a
		Pattern p = Pattern.compile("a+"); //Number of occurances of atleast 1 or more a a
//		Pattern p = Pattern.compile("a*"); // Any Number of a's including 0
//		Pattern p = Pattern.compile("a?"); // atmost 1 a , either 1 a or 0 a
		Matcher m = p.matcher("abaabaaab");
	
		while(m.find()) {
		
		System.out.println(m.start()+"----"+m.group());
	}

//		Pattern p = Pattern.compile("\\d+");
//		Pattern p1 = Pattern.compile("[a-z]");
//		Matcher m = p.matcher("a2b4c45d234");
//		Matcher m1 = p1.matcher("a2b4c45d234");
//		
//		while(m.find()) {
//			
//			System.out.println("The Integers are : "+m.group());
//		}
//		while(m1.find()) {
//			
//			System.out.println("The Characters are :"+m1.group());
//		}

	}

}
