package StarPatterns;

public class ReverseInteger {
	
	public static int reverse(int x) {
		
		int temp = 0;
		int rem=0;
		while(x!=0) {			
			rem=x%10;
			x=x/10;
			temp=temp*10+rem;
			
		}		
		
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(120));
		System.out.println(reverse(-321));

	}

}
