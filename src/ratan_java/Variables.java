package ratan_java;

public class Variables {
	static int l=200; // instance variable
	
	public static void add() { // static method
		int k=40;// static area
		System.out.println(k);
	}
	void diff() {//instance method
		//instance body
		int z=100;
		System.out.println(z);
	}
	 public Variables() {
		System.out.println("print");
	}
	public static void main(String[] args) {
		//int a=10,b=20; // local variables
//		Variables d = new Variables();
//		d.diff();
		System.out.println(Variables.l);
		
		
		

	}

}
