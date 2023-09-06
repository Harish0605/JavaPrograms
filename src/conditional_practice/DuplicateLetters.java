package conditional_practice;

public class DuplicateLetters {

	public static void main(String[] args) {
		String s = "ajayja iss greatg mana";
		String[] a = s.split(" ");
		for(int m=0;m<a.length;m++) {
			String temp = a[m];
			char[] ch = temp.toCharArray();	
			for(int i=0;i<ch.length;i++) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						ch[j]='\0';
					}
				}
			}
			for(int k=0;k<ch.length;k++) {
				if(ch[k]!='\0') {
					System.out.print(ch[k]);
				}
			}
		}
		
	}

}
