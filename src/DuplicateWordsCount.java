import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWordsCount {

	public static void main(String[] args) {
		String s = "here is java best language is you here";
		duplicateCount(s);
		System.out.println("second method -----------------");
		duplicateCount1(s);
	}	
	private static void duplicateCount(String s) {
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		String[] words = s.split("\\s");
		for(int i=0;i<words.length;i++) {
			if(!map.containsKey(words[i])) {
				map.put(words[i],1);
			}else {
				map.put(words[i], map.get(words[i])+1);
			}
		}
		for(Entry<String,Integer> e:map.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey()+" repeated = "+e.getValue());
			}
		}
		
	}
	
	private static void duplicateCount1(String s) {
		String[] arr = s.split("\\s");
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					arr[j]="\0";
				}
				
			}
			if(count>1 && arr[i]!="\0") {
				
				System.out.println(arr[i]+" repeated = "+count);
			}
			
		}
		
	}

}
