package ratan_java;
import java.util.*;
public class ArrayListAL {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(1, 300);
		al.add(2, 400);
		//al.remove(0);
		System.out.println(al.contains(300));
		for(int k:al) {
			System.out.println(k);
		}
		
		System.out.println("***************");
		ArrayList<String> li = new ArrayList<String>();
		li.add("harish");
		li.add("kumar");
		System.out.println(li.contains("kumar"));
		for(String s:li) {
			System.out.println(s);
		}
		
	}

}
