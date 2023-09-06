
public class printWithoutUsingLoop {
	
	public static void printWithoutLoop(int a,int num) {
		
		if(a<num) {
			System.out.print(a);
			a++;
			printWithoutLoop(a++,num);
//		}return a;
		}
	}
	
	public static int printWhileLoop(int a) {
		while(a<5) {
			System.out.print(a);
			a++;
		}return a;
	}

	public static void main(String[] args) {
		printWithoutLoop(1,5);
		System.out.println();
		System.out.println("**************************************************************");
		printWhileLoop(1);

	}

}
