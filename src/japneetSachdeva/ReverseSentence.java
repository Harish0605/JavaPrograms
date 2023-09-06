package japneetSachdeva;
//Reverse sentence
public class ReverseSentence {
	
	public static String reverse(String s) {
		String[] words = s.split(" ");
		String output = "";
		for(int j=words.length-1;j>=0;j--) {
			output = output + words[j] + " ";
		}
		return output.trim();
	}

	public static void main(String[] args) {
        String s1 = "Welcome to geeksforgeeks";
        String s2 = "I love Java Programming";
        String s3 = "Programming is fun";
        System.out.println(reverse(s1));
        System.out.println(reverse(s2));
        System.out.println(reverse(s3));


	}

}
