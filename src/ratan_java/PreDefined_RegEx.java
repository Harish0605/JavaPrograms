package ratan_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefined_RegEx {

	public static void main(String[] args) {
	
//   	Pattern p = Pattern.compile("[\\S]"); // Any Character except Space
		Pattern p = Pattern.compile("[\\s]"); // Space Character
//		Pattern p = Pattern.compile("[\\d]"); // only digits
//		Pattern p = Pattern.compile("[\\D]"); // any characters except Digit
//		Pattern p = Pattern.compile("\\W");  // special characters only
//	Pattern p = Pattern.compile("[\\w]");  // any character except special characters
//	Pattern p = Pattern.compile("."); // any symbol including special character
		Matcher m = p.matcher("a7b K@9");
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}

	}

	}


