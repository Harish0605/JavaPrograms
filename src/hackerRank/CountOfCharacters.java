package hackerRank;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharacters {
	
	public static void charactersCount(String s) {
		String output = "";
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			output=output+m.getValue()+""+m.getKey();
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		//charactersCount(s1);
		String s= "aabbccaa";
		charactersCount(s);
		
		
		
		
		

	}

}
