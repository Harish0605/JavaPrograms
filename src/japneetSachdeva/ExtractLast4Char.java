package japneetSachdeva;
//Extract Last 4 characters of any String
public class ExtractLast4Char {
	
	public static void extractNChar(String s,int extract) {
		String output = "";
		int count = 0;
		for(int i=s.length()-1;i>=0;i--) {
			if(count < extract ) {
				output = output+s.charAt(i);	
				count++;
			}			
		}
		StringBuffer sb = new StringBuffer(output);
		System.out.println(sb.reverse());
		
	}

	public static void main(String[] args) {
		String s = "harish";
		String s1 = "piano";
		String s2 = "four";
		extractNChar(s,4);
		extractNChar(s1,3);
		extractNChar(s2,2);

	}

}
