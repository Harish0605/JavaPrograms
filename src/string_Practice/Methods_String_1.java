package string_Practice;

public class Methods_String_1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2 ="Hello";
		String s3="I am";
		System.out.println(s1.equalsIgnoreCase(s2)); //checks content ignoring the case
		
		System.out.println(s1.contains("H")); // checks the content and case-sensitive
		
		System.out.println(s1.startsWith("he")); //only starting sequence
		
		System.out.println(s1.endsWith("lo")); // only exact ending sequence
		
		// Here contains method will check whether the target is present in string or not
		// but starts with and ends with are strict and checks the exact sequence
	    System.out.println(s3.length()); //space is also considered as a character 
	    
	    String s4 = "Hello World ";
	    String s5 = " Harish is  my Friend    ";
	    
	    System.out.println(s4.length());
	    System.out.println("Before trim");
	    System.out.println(s4.trim().length());// will remove leading and trailing spaces only
	    System.out.println("After trim");
	    System.out.println(s5.length());
	    System.out.println(s5.trim().length());
	
	
	
	}
	

}
