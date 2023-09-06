package ratan_java;
import java.util.*;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("durga");
    ListIterator<String> li = al.listIterator();
    li.add("sravya");
    while(li.hasNext()) {
    	String s = li.next();
    	
    	if(s.equals("durga"))
    		li.remove();
    	if(s.equals("anu"))
      li.set("anushka");
    	
    }System.out.println(al);
    
	}

}
