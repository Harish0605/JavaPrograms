package ratan_java;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("Harish");
		v.add("kumar");
		v.add("kiran");
		v.add("kunal");
		
		System.out.println(v);
		Enumeration<String> etr = v.elements();
		while(etr.hasMoreElements()) {
			String s = etr.nextElement();
			System.out.println(s);
		}

	}

}
