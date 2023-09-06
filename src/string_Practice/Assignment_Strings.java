package string_Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment_Strings {

	public static void main(String[] args) {
		String input1 = "java is super"; // count the number of characters
		System.out.println(input1.length()); //13
		
		String input2="java is super"; // count the number of words in a string
		String[] words = input2.split("\\s");
		System.out.println(words.length); //3
		
		String input3 = "Hello World"; //count the total number of occurances of given character in String
		char target='l';
		int count=0;
		for(int i=0;i<input3.length();i++) {
			if(input3.charAt(i)==target) {
				count++;
				
			}
		}
		System.out.println(count);

		String input4 ="java is super";
		String temp="";
		for(int i=input4.length()-1;i>=0;i--) {
			 temp=temp+input4.charAt(i);
		}
		System.out.println(temp); //repus si avaj
		
		StringBuffer sb = new StringBuffer(input4);
		System.out.println(sb.reverse());
		
		String input5 ="   hello world  "; //remove starting and ending spaces
		System.out.println(input5.trim()); //hello world
		
		String input6 = "java is easy"; // reverse each word of a given string
		String[] rev = input6.split("\\s");
		String reverse="";
		for(int i=0;i<rev.length;i++) {
			String s = rev[i];
			for(int j=s.length()-1;j>=0;j--) {
			reverse=reverse+s.charAt(j);
				
			}						
		}
		System.out.println(reverse); // avajsiysae
		
		String input7="This is a test Strings"; //change odd wprds to uppercase and reverse the even words
		// THIS si A tset STRING
		String temp1="";
		String[] wrds7 = input7.split("\\s");
		for(int i=0;i<wrds7.length;i++) {
			String start = wrds7[i];
			if(start.length()%2==0) {
				for(int j=start.length()-1;j>=0;j--) {
					temp1 = temp1+start.charAt(j);
				}
			}else {
				temp1=temp1+start.toUpperCase();
			}

		System.out.println(temp1); // sihTsitsetASTRINGS
		
		String input8 = "JavA5is&Su6p%eR"; 
		int count1=0,count2=0,count3=0,count4=0;
		for(int k=0;k<input8.length();k++) {
			
			if(Character.isDigit(input8.charAt(k))) {
				count1++;				
			}
			else if(!Character.isLetter(input8.charAt(k))) {
				count2++;	
			}
			else if(input8.charAt(k)>='a' && input8.charAt(k)<='z' ) {
				count3++;
			}
			else if(input8.charAt(k)>='A' && input8.charAt(k)<='Z' ) {
				count4++;
			}
		}
		
		
		System.out.println("Digits = "+count1);
		System.out.println("Special Characters = "+count2);
		System.out.println("Lower case letters are = "+count3);
		System.out.println("Upper case letters are = "+count4);
		
		
}
}
}
