
public class armStrongNumner {

	public static void main(String[] args) {
		int num = 407;
		int temp=num;
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==temp) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}

	}

}
