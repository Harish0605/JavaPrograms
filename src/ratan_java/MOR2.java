package ratan_java;

 class Dad{ // cannot extend the class if its final
	  void m1() {// cannot override if parent method is final
		
	System.out.println("Dad class m1 method");	
	}
}


public class MOR2 extends Dad {
	  void m1() { 		
		System.out.println("MOR2 class method");
	}
	  void m2() {
		  System.out.println("m2 direct method");
	  }

	public static void main(String[] args) {
		Dad d = new MOR2(); //parent class able to hold child class object	
		d.m1(); 
		//d.m2(); // method m2 is undefined in D class
		// perform type casting to avoid the error
		MOR2 m = (MOR2)d;
		m.m2();
		//MOR2 m = new Dad(); // Child class unable to hold Parent class object
		

	}

}
