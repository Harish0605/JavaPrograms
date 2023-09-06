
public class FindPrimeNumber {
	
	public static boolean checkPrime(int n) {
	int count=0;	
	for(int i=1;i<n/2;i++) {
		if(n%i==0) {
			System.out.println("not prime"+n);
			count=1;
			break;
		}if(count==0) {
			System.out.println("is prime"+n);
		break;
		}
	}
	
	return true;
	}
	

	public static void main(String[] args) {
		checkPrime(11);

	}

}
