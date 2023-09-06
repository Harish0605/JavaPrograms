package japneetSachdeva;

import java.util.LinkedHashMap;
import java.util.Map;
//1) Find first non repeated character
public class FirstNonRepeatingChar {

	public static void findNonRepeated(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println("First non repeating char is " + m.getKey());
				break;
			}
		}

	}

	public static void main(String[] args) {
		String s = "algorithm";
		String s1 = "geeksforgeeks";
		findNonRepeated(s);
		findNonRepeated(s1);

	}

}
