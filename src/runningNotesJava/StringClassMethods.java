package runningNotesJava;

public class StringClassMethods {
	public static void printAtOddPosition(String str) {
		// Print Characters Presented at Odd Positions by Using the charAt() Method
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				System.out.println("Char at " + i + " is " + str.charAt(i));
			}
		}
	}
	
	//compareTo method
	public static int compareTwoStrings(String s1,String s2) {
		return s1.compareTo(s2);
	}

	public static void main(String[] args) {		
		String str = "Welcome to Javatpoint portal";
		StringClassMethods.printAtOddPosition(str);
		
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";
		System.out.println(compareTwoStrings(s1,s2));
		System.out.println(compareTwoStrings(s1,s3));
		System.out.println(compareTwoStrings(s1,s4));
		System.out.println(compareTwoStrings(s1,s5));
		
		

		
		
		
		

	}

}
