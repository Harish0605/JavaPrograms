package hackerRank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitStringTokens {

	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		
//		Pattern p = Pattern.compile("[\\w]+");
//		Matcher m = p.matcher(s);
//		ArrayList<String> al = new ArrayList<String>();
//		while(m.find()) {
//			al.add(m.group());
//		}
//		System.out.println(al.size());
//		for(String a:al) {
//			System.out.println(a);
//		}
		
		
		StringTokenizer str = new StringTokenizer(s,"[ !,?._'@ ]");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			
		}
		

	
		

		
	}

}
