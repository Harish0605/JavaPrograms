package ratan_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ConversionArrays {

	public static void main(String[] args) {
		//Conversion of Arrays to collection 
		String[] s = {"abc","bbc","cdc"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
       
        al.add("kumar");
        al.add("kiran");
        System.out.println(al);
     
        // conversion of collections to arrays
        
        
        ArrayList<String> li = new ArrayList<String>();
        li.add("kumar");
        li.add("harish");
        String[] a = new String[li.size()];
        li.toArray(a);
        for(String k:a) {
        	System.out.println(k);
        }
        
	}

}
	