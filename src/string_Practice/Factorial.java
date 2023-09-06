package string_Practice;

public class Factorial {
	public static int fact(int n) {
		if(n==0)
			return 1;
		else {
			return n * fact(n-1);
		}
		
		
	}
	public static void factorial(int n){
        int fact =1;
        while(n>=1){
           fact = fact*n;
           n--;
        }
        System.out.println(fact);
       
    }

	public static void main(String[] args) {
		factorial(4);
		System.out.println(fact(4));

	}

}
