package ratan_java;

public class ManipulationString {

	public static void main(String[] args) {
		String s1 = "harish";
		String s2 = new String("harish");
		String s3 = new String("harish");
		String s4 = "harish";
		
		if(s1==s2)
       System.out.println("equal");
		if(s2==s3)
			System.out.println("equal");
		if(s1==s4) {
			System.out.println("true");
		}
		
		s1.concat("world");
		System.out.println(s1);
		StringBuffer sb = new StringBuffer("harish");
		sb.append("world");
		System.out.println(sb);
	}

}
