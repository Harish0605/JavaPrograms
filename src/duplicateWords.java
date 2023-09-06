
public class duplicateWords {

	public static void main(String[] args) {
		String str = "Big black bug bit a big nose black dog on his big black nose";
		int count;
		str=str.toLowerCase();
		System.out.println(str);
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";//Set words[j] to 0 to avoid printing visited word
				}
			}
			if(count>1 && words[i]!="0") {
				
				System.out.println(words[i]+" :: "+count); 
				 
			}
		}

	}

}
