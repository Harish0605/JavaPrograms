

public class repeatingCharectersWithNum {
	
	public static String repeatingCharectersWith(char c,String s) {
		String temp = "";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i)) {
				count=count+1;
				temp=temp+count;
			}else {
				temp=temp+s.charAt(i);
			}
		}
		
		
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(repeatingCharectersWith('a',"abacaefa"));

	}
}
