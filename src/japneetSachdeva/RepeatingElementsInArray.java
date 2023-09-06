package japneetSachdeva;

import java.util.LinkedHashMap;
import java.util.Map;
//Find only repeating elements
public class RepeatingElementsInArray {
	
	public static void findRecurringElements(int[] arr) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()!=1) {
				System.out.println(m.getKey());
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,4,1,5,2,6,7,1,3,2,4,8};
		findRecurringElements(arr);
	}

}
