package string_Practice;

public class Methods_2_String {

	public static void main(String[] args) {
		String s1="harish";
		String s2 ="RAJ";
		String s3="munnaaam";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		

		char[] ch = s1.toCharArray();
		for(char k:ch) {
			System.out.println(k);
		}
		
		// Debug Process
		// To see the execution process
		//Set the Toggle Breakpoint
		//Debug As
		//Resume and proceed
		
		System.out.println(s1.indexOf("r")); // If there is no index available then its -1	
		
		System.out.println(s1.lastIndexOf("h")); // gives last occurrence 
		
		System.out.println(s3.indexOf('n')); // will give the first occurrence
		System.out.println(s3.lastIndexOf("m")); // will give the last occurrence

	}

}

