
public class palindromeNumber {

	public static void main(String[] args) {
		int num =1331;
		int temp=num;
		int rem=0;int sum=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum*10+rem;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
	}	
}
