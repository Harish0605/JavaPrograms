package string_Practice;

import java.util.Arrays;

public class Methods_3_String {

	public static void main(String[] args) {
		String s1 ="Harish is a le@arner";
		System.out.println(s1.substring(4)); 
		//If we dont specify the end index then the entire string after start index will print
		System.out.println(s1.substring(3, 5));
		// Now 5 is not included that means it will print the in between characters 
		// by including start index and excluding end index
		
		String[] arr = s1.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String[] arr1=s1.split("\\@");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(s1.replace("is", "replace"));
		System.out.println(s1.replace("h", "1"));

	}

}
