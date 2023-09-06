package ratan_java;
import java.util.*;

public class RepeatingCharacterscountMap {
	
	public static void countMethod(String s) {
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i),m.get(s.charAt(i))+1);
				
			}else {
				m.put(s.charAt(i),1);
			}
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
	String s = "aabbbccdd";
	String s1 = "abbccd";
	String s2 = "abbaccddae";
	countMethod(s);
	countMethod(s1);
	countMethod(s2);
	
	

	}

}
