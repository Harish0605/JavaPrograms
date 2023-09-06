package ratan_java;

public class CombinedModuleExample {
	int a=10; //instance variable
	static int b=20; // static variable
	void m1(int a) { //instance method
		System.out.println("instance method");
	}
	static void m2(String str) {//static method
		System.out.println("static method");
	}
	CombinedModuleExample(){
		System.out.println("0-arg cons");
	}
	CombinedModuleExample(int a){
		System.out.println("1-arg cons");
	}
	{
		System.out.println("instance block");
	}
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		CombinedModuleExample c1= new CombinedModuleExample();
		CombinedModuleExample c2= new CombinedModuleExample(10);
		c1.m1(10); 
		
		CombinedModuleExample.m2("Harish");
		


	}

}
