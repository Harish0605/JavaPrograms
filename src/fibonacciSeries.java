
public class fibonacciSeries {
	
	public static void fibonacciNum(int n) {
		int num1=0,num2=1,sum=0;
		
		for(int i=0;i<n;i++) {
			num1=num2; //num1=1,0,1,1,2
			num2=sum; // num2=0,1,1,2,3
			sum=num1+num2; // sum=1,1,2,3,5
			System.out.println(sum);
			
		}
//		int i=0;
//		while(i<n) {
//			num1=num2;
//			num2=sum;
//			sum=num1+num2;
//			System.out.println(sum);
//			i++;
//		}
		
	}
	

	public static void main(String[] args) {
		fibonacciNum(9);		

	}

}
