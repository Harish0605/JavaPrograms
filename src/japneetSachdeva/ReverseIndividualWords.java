package japneetSachdeva;
//Reverse each word present in sentence
public class ReverseIndividualWords {
	
	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		String output = "";
		for(int i=0;i<words.length;i++) {
			for(int j=words[i].length()-1;j>=0;j--) {
				output = output + words[i].charAt(j);
			}
			output = output + " ";
		}
		return output.trim();
	}

	public static void main(String[] args) {
		String s = "Hello World";
		String s1 = "Geeks for Geeks";
		System.out.println(reverseWords(s));
		System.out.println(reverseWords(s1));
	}

}
