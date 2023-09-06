package ratan_java;
import java.util.*;

public class IteratorCursor {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			int a = itr.next();
			System.out.println(a);
			
		}
		
	}

}
