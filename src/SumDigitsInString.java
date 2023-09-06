
public class SumDigitsInString {

	public static void main(String[] args) {
		String s ="abc25";
		int sum=0;
		for (int i=0;i<s.length();i++) {
		if(!((s.charAt(i)>='a' || s.charAt(i)<='z'))) {
		
				
					sum=sum+Integer.valueOf(s.charAt(i));
					System.out.println(sum);
				
				
			}
		}//System.out.println(sum);

	}

}
