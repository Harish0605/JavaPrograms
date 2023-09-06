package string_Practice;

public class Methods_4_String {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "987";
		//convert String to Integer
		int num = Integer.valueOf(s2);
		System.out.println(num);
		
		String s3="9879900";
		Long lnum = Long.valueOf(s3);
		System.out.println(lnum);
		
		String s4="2.4";
		Double d = Double.valueOf(s4);
		System.out.println(d);
		
		char c = '3';
		int n = Character.valueOf(c); // In Character, we get Ascii values as output 
		System.out.println(n);
		
		//convert Integer to String
		int a=10;
		String s = String.valueOf(a);
		System.out.println(s);
		System.out.println(s.charAt(0));
 
		//isEmpty 
		String s8;
		String s5="";
		String s6="   ";
		// we cannot apply any methods without initalising the string variable
		System.out.println(s5.isEmpty()); //isEmpty will become true only when length is 0
		System.out.println(s6.isBlank()); //isBlank will become true only if there are some spaces
		//isBlanks is trim().length() == It will trim the spaces and check whether its empty or not 
		
		
	}

}
