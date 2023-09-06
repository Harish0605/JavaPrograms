package string_Practice;
import java.util.*;
import java.util.Map.Entry;

public class Assignment_Strings_3 {
	public static String maxLegth(String s) {
		String[] words = s.split("\\s");
		int max=words[0].length();
		String temp=words[0];
		for(String ch:words) {
			if(ch.length()>max) {
				max=ch.length();
				temp=ch;
			}
			
		}
		
		
		return temp;
	}

	public static void main(String[] args) {
		// input = java is super keka easy and awesome //words at even positions of string
		//ouput : is, keka, and
		String ip10 = "java is super keka easy and awesome";
		String[] arr = ip10.split("\\s");
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		
		for(Entry<String,Integer> e:map.entrySet()) {
			if(e.getValue()%2!=0) {
				System.out.println(e.getKey());
			}
			
		}
		
		System.out.println(maxLegth("hello how are you Moooommmmm")); //output: Moooommmmm
		System.out.println(maxLegth("hello how are you reddy")); //output: hello
		
	   
		
	}
}


