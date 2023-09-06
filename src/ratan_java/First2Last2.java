package ratan_java;

public class First2Last2 {
	
	public static String sequence(String s) {
		String t = "";
		if(s.length()<=2) {
			return s;
		}else {
			
		}
		for(int i=0;i<s.length();i++) {
			if(i<2) {
			t=t+s.charAt(i);
						
			}
			if(i>=s.length()-2) {
				
				t=t+s.charAt(i);
				
			}
			
		}
		return t;
	}

	public static void main(String[] args) {
		
		System.out.println(sequence("A"));
		System.out.println(sequence("AB"));
		System.out.println(sequence("ABC"));
		System.out.println(sequence("ABCD"));
		System.out.println(sequence("ABCDEF"));


	}

}
