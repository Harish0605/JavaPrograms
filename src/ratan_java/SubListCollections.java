package ratan_java;

import java.util.ArrayList;
import java.util.Collections;

public class SubListCollections {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("harish");
		al.add("kumar");
		al.add("rana");
		al.add("pratap");
		al.add("mukesh");
		al.add("adani");
		ArrayList<String> li = new ArrayList<String>(al.subList(2, 4));
		// sublist starting index included but ending index excluded
		System.out.println(li);
		
		//swap rana to mukesh
		
		Collections.swap(al, 2, 4);
		System.out.println(al);

	}

}
