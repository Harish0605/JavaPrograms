package string_Practice;

public class Assignment_Strings_5 {
	
	public static String fileNameExtension(String s) {
		String[] words = s.split("[.]");
		String extnsion = "";
		for(int i=0;i<words.length;i++) {
			if(i>=words.length-1) {
				extnsion = extnsion + words[i];
			}
		}	
		
		return extnsion;
	}
	
	private static String palindrome(String s) {
		String rev = "";
		StringBuffer sb = new StringBuffer(s);
		rev = rev + sb.reverse();
		if(rev.equals(s)) {
			return (rev+" is a Palindrome");		
		}
		else {
			return (s+" is not a Palindrome");			
		}	
		
	}

	public static void main(String[] args) {
		String s1 = "passport.jpg";
		String s2 = "pancard.png";
		String s3 = "resume.pdf";
		
		System.out.println(fileNameExtension(s1));
		System.out.println(fileNameExtension(s2));
		System.out.println(fileNameExtension(s3));
		
		String s4 = "JavaJ";
		String s5 = "Javaj";
		String s6 = "hyrtutorials";
		
		System.out.println(palindrome(s4));
		System.out.println(palindrome(s5));
		System.out.println(palindrome(s6));	

	}

}
