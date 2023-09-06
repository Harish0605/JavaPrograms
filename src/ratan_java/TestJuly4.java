package ratan_java;

import java.util.ArrayList;

public class TestJuly4 {

	public static void main(String[] args) {
		
		String str = "a2bc4d45";
		String temp="";
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Character> a2 = new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++) {
			int count =0;
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				a2.add(str.charAt(i));
			}
			else {
				Character ch = str.charAt(i);
				temp=ch.toString();
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(j)>='a' && str.charAt(j)<='z') {
						break;
					}else {
						temp=temp+str.charAt(j);
						count=j;
						}
						
					}
					a1.add(Integer.parseInt(temp));
					if(count>=1) {
						i=count;
					}
					
					
				}
			}
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a2);
		System.out.println(a2.size());
		
		

	}
}

