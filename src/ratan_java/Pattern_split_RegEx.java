package ratan_java;
import java.util.StringTokenizer;
import java.util.regex.*;

public class Pattern_split_RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\s"); //split using spaces
		String[] s = p.split("durga soft solutions");
		for(String k: s) {
			System.out.println(k);
		}
		
		System.out.println("************");
		
		//Pattern p1 = Pattern.compile("\\.");
		Pattern p1 = Pattern.compile("[.]"); // both can be used to split using .
		String[] s1=p1.split("www.durgasoft.com");
		for(String l: s1) {
			System.out.println(l);
		}
		System.out.println("************");
		
		Pattern p2 = Pattern.compile("[^0-9]");
		String[] s2=p2.split("24-12-2015");
		for(String m: s2) {
			System.out.println(m);
			
		}
		System.out.println("************");
		
		StringTokenizer str = new StringTokenizer("24-12-2015","-");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		

	}

}
