
public class palindrome {
	
	public static void isPalindrome(String s) {
		String str1=s.toLowerCase();
		String str2="";
		for(int i=s.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		if(str1.equalsIgnoreCase(str2)) {
			if(str1.length()==str2.length())
			System.out.println("palindrome");
			
		}else {
			System.out.println("Not palindrome");
		}


	}

	public static void main(String[] args) {
		isPalindrome("aba");
			}

}
