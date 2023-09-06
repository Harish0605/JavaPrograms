package hackerRank;

import java.util.*;;

public class LongestSubstringWithoutrepeat {
	
	public static void LongestSubStr(String s) {
     int lengthOfLongestSubstrng = 0;
     String LongestSubstring = null;
     char[] ch = s.toCharArray();
     Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
     for(int i=0;i<ch.length;i++) {
    	 if(map.containsKey(ch[i])) {
    		 i=map.get(ch[i]);
    		 map.clear();
    	 }
    	 else {
    		 map.put(ch[i], i);
    	 }
     }
     LongestSubstring=map.keySet().toString();
     lengthOfLongestSubstrng=map.keySet().size();
     
     
     System.out.println(lengthOfLongestSubstrng);
     System.out.println(LongestSubstring);
	}

	public static void main(String[] args) {
		String s = "abcab";
		LongestSubStr(s);
	

	}

}
