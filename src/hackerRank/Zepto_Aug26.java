package hackerRank;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Zepto_Aug26 {

	public static void main(String[] args) {
		// shouldnt use split and reverse built in method
		String str = "I like apple"; // incomeplete code
//		String str = "our country name is INDIA our home";
		String temp = "";
		String ss = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				temp=temp+str.charAt(i);
				
			}else if(str.charAt(i)==' ') {
				
				if(temp.length()%2==0) {
					String rev="";
					for(int j=temp.length()-1;j>=0;j--) {
						rev=rev+temp.charAt(j);
					}
					ss=ss+rev+str.charAt(i);
					temp="";
				}
				else {
					ss=ss+temp+str.charAt(i);
					temp="";
				}
			}
			if(i==str.length()-1) {
				
			}
		}
		
		

	
	}

}
