package ratan_java;
import java.util.regex.*;

public class Character_RegEx {

	public static void main(String[] args) {
		//Pattern p = Pattern.compile("[abc]"); // 024
//		Pattern p = Pattern.compile("[a-z]"); // 0248
//		Pattern p = Pattern.compile("[^a-z]"); // 135679
//		Pattern p = Pattern.compile("[A-Z]"); // 9
//		Pattern p = Pattern.compile("[a-zA-Z]"); // 02489
//		Pattern p = Pattern.compile("[0-9]"); // 136
//	Pattern p = Pattern.compile("[^a-zA-Z0-9]"); // 57
		//Matcher m = p.matcher("a2b4c#7@dA");		
	Pattern p = Pattern.compile("\\d+"); 
	Matcher m = p.matcher("a2b23c345d34");
		
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
