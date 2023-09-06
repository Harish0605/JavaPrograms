package hackerRank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class RegEX2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int num = scan.nextInt();
		 while(num-->0) {
			 String s = scan.nextLine();
			 Map<String,Integer> m = new LinkedHashMap<>();
			 String[] arr = s.split(" ");
			 for(int i=0;i<arr.length;i++) {
				 if(!m.containsKey(arr[i])) {
					 m.put(arr[i], 1);
				 }
				 else {
					 
					 m.put(arr[i], m.get(arr[i])+1);
					 
				 }			 
			 }
			 for(Map.Entry<String,Integer>map:m.entrySet()) {
				 if(map.getValue()>=1) {
					 System.out.println(map.getKey());
					 
				 }
				 
			 }
			 
		 }
		 scan.close();

		 
		// System.out.println(m.toString());

	}

}
