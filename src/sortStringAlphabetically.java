import java.util.Arrays;

public class sortStringAlphabetically {
	
	public static void sortString(String s) {
		String[] words = s.split("\\s");
		int len=0;
		String swap="";
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].length()>=words[j].length()){
					len=words[j].length();
				}else {
					len=words[i].length();
				}
				for(int k=0;k<len;k++) {
					if(words[i].charAt(k)==words[j].charAt(k)){
					if(k==len-1) {
						if(words[i].length()!=len) {
							String temp = words[i];
							words[i]=words[j];
							words[j]=temp;
						}
					}
					}
					else if(words[i].charAt(k)>words[j].charAt(k)) {
						swap=words[j];
						words[j]=words[i];
						words[i]=swap;
						break;
					}else {
						break;
				}
				}
			}
		}
		
		System.out.println(Arrays.toString(words));
	}

	public static void main(String[] args) {
		String a = "is Sneha my Friend";
		String b = "My name is Raj"; 
		String c = "java iS Powerful Language"; 
		String d = "Java PiS Powerful Language"; 
		String e = "Javalan Java Power Powerful"; 
		String f = "Hary Hari"; 
		
		sortString(a);
		sortString(b);
		sortString(c);
		sortString(d);
		sortString(e);
		sortString(f);
 
   	

}
}
