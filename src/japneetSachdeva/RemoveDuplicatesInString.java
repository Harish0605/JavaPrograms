package japneetSachdeva;
//Remove duplicate words from a String
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String s = "Java is a programming language and Java is widely used in the software industry.";
		String output = "";
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		String[] ch = s.split(" ");
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue()==1) {
				output = output + m.getKey() + " ";
			}
		}
		System.out.println(output.trim());
		
	}

}
