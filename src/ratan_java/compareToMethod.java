package ratan_java;

public class compareToMethod {

	public static void main(String[] args) {
		String s1 = "harish";
		String s2 = "harish";
		String s3 = "kumar";
		String s4 = "harsha";
		String s5= "abc";
		System.out.println(s1.compareTo(s2)); // 0 because content is same
		System.out.println(s2.compareTo(s4)); // -10 because unicode value of i - value of s gives -10
		System.out.println(s1.compareTo(s3));// -3 because unicode value of h - value of s gives -3
		System.out.println(s1.compareTo(s5)); // 7 because unicode value of h - value of a gives 7
		
		//Unicode values 
//		Lowercase starting of alphabets	65
//		Lowercase ending of alphabets	90
//		Uppercase starting of alphabets	97
//		Uppercase ending of alphabets	122

	}

}
