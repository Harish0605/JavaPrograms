package ratan_java;

public class MOL { //mapping done at compile time - compile time polymorphism
//method overloading	
	void m1(int a,int b,int c) {
		System.out.println("m1 method 3 parameter");
	}
	void m1(int a,int b) {
		System.out.println("m1 method 2 parameter");	
	}

//cons overloading
	
	MOL(int a){
		System.out.println("int method");
		
	}
	MOL(String str){
		System.out.println("string method");
		
	}
// operator overloading	
	MOL(int a,int b){ ////operator overloading with + 
		System.out.println(a+b);
		
	}
	MOL(String a,String b){ ////operator overloading with + 
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
	new MOL(10);
	new MOL("hari");
	new MOL(10,20);
	new MOL("hari","kumar");
   
}
	


}
