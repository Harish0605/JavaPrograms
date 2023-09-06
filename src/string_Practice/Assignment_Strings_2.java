package string_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment_Strings_2 {

	public static void main(String[] args) {
		String str = "java is super easy"; //first non repeated character is j and first repeated character is a
	   char[] arr = str.toCharArray();
	  
	   for(int i=0;i<arr.length;i++) {
		   boolean unique=true;
		   for(int j=0;j<arr.length;j++) {
			   
			   if(i!=j && arr[i]==arr[j]) {
				   unique = false;
				   break;
			   }
		   }if(unique) {
			   System.out.println("first non repeated character is :"+arr[i]);
			   break;
		   }
	   }
	   
	   boolean isFound = false;
       for(int i=0; i<str.length(); i++) {
           for(int j=i+1; j<str.length(); j++) {
               if(str.charAt(i)==str.charAt(j)) {
                   System.out.println(str.charAt(i)+" is the first character that occurs");
                   isFound = true;
                   break;
               }
           }
           if(isFound) {
               break;
           }
       }
	}

}
