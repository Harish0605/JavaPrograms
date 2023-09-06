package ratan_java;
import java.util.regex.*;

public class RegEx {

	public static void main(String[] args) {
//		int count=0;
		Pattern p = Pattern.compile("[0-2][0-5][0-5]+[.][0-9]+");
//		Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher("000.012");
		while(m.find()) {
//			count++;
			//System.out.println(m.start());
			System.out.println(m.group());
		}
//		System.out.println("The Number of occurances are : "+count);

	}

}
