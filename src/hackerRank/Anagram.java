package hackerRank;
import java.util.*;
public class Anagram {
	
	public static boolean anagram(String a, String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		
Map<Character,Integer> map1 = new LinkedHashMap<Character,Integer>();
Map<Character,Integer> map2 = new LinkedHashMap<Character,Integer>();
for(int i=0;i<a.length();i++) {
	if(map1.containsKey(a.charAt(i))) {
		map1.put(a.charAt(i), map1.get(a.charAt(i))+1);
	}else {
		map1.put(a.charAt(i),1);
	}
}
for(int j=0;j<b.length();j++) {
	if(map2.containsKey(b.charAt(j))) {
		map2.put(b.charAt(j), map2.get(b.charAt(j))+1);
	}else {
		map2.put(b.charAt(j),1);
	}
}

if(map1.equals(map2)) {
	return true;
}else {
	return false;
}	
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2= scan.next();
		boolean status =anagram(s1,s2);
      if(status) {
    	  System.out.println("Anagrams");
      }else {
    	  System.out.println("Not Anagrams"); 
      }
	}

}
