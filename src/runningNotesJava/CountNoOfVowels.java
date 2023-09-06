package runningNotesJava;

import java.util.ArrayList;

public class CountNoOfVowels {
	
	private static boolean findVowel(char ch) {
		boolean find = false;
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('A');al.add('E');al.add('I');al.add('O');al.add('U');
		al.add('a');al.add('e');al.add('i');al.add('o');al.add('u');
		for(int i=0;i<al.size();i++) {
			if(ch==al.get(i)) {
				find = true;
				break;
			}else {
				find = false;
			}
		}		
		return find;
	}
	
	public static void countVowels(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(findVowel(s.charAt(i))) {
				count++;
			}
		}
		System.out.println("Total number of vowels in a given String : "+count);
	}

	public static void main(String[] args) {
		String s1 = "Javatpoint is a great site for learning Java.";  
		String s2 = "One apple in a day keeps doctor away.";
		countVowels(s1);
		countVowels(s2);	

	}

}
