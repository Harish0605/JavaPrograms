package ratan_java;

class Father{
	Father(){
		System.out.println("Parent class constructor 0-arg ");
	}
}

public class ParentClassConstructors extends Father {
	ParentClassConstructors(){
		this(10);
		System.out.println("child class constructor 0-arg");		
	}
	ParentClassConstructors(int a){	
		super();
		System.out.println("child class constructor 1-arg");		
	}
	
	public static void main(String[] args) {
		new ParentClassConstructors();
		new	ParentClassConstructors(20);
		

	}

}
