package rahulShetty;

public class MultiplicationTable {
	
	public static int[] table(int n) {
		int[] arr=new int[11];
		for(int i=0;i<11;i++) {
			arr[i]=n*i;
		}
		
		return arr;
		
	}
	public static int multiply(int a, int b) {
		int output = 0;
		output = a * b;			
		return output;
		
	}

	public static void main(String[] args) {
		
		int[] a=table(6);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("*********************");
		System.out.println(multiply(5,10));
        System.out.println(Math.multiplyFull(10, 20));
	}

}
