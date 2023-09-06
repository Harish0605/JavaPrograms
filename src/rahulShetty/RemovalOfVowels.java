package rahulShetty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemovalOfVowels {

	public static void main(String[] args) {
        String vowels = "aeioud";
        String s = "Advisor 360 - Creating wealth";
        String temp = "";
//        String temp = "[" + vowels + "]";
//        Pattern p = Pattern.compile(temp);
//        Matcher m = p.matcher(s);
//       
//        String result = m.replaceAll(""); // Replace matching vowels with an empty string
//        System.out.println(result);
        
        for(int i=0;i<s.length();i++) {
        	if(!vowels.contains(""+s.charAt(i))) {
        		temp = temp + s.charAt(i);
        		
        	}
        }
        System.out.println(temp);
    }

}
