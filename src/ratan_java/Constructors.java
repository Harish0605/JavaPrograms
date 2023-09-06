package ratan_java;

public class Constructors {
	
//	Constructors(){
//		System.out.println("0-arg cons method");
//		
//	}
//	Constructors(int a){
//		System.out.println("1 arg cons method");
//		
//	}
//	
//	
//	void m2() { 
//		System.out.println("m2 method");
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Constructors t = new Constructors();
//		Constructors t1 = new Constructors(10);
//		t.m2();
//	}
//Example-2 VVVVV IMp
	// contructors are used to initalize values to instance variables during object creation
	int empId;
	String empName;
	float empSalary;
	
	Constructors(int id, String name, float sal){
		//convert the local variables to instance variables and then use them through out the app
		empId=id; // if names are same then only use this keyword
		this.empName=name;
		this.empSalary=sal;
	}
	void display() {
		System.out.println("Emp id is ="+empId);
		System.out.println("Emp name is ="+empName);
		System.out.println("Emp salary is = "+empSalary);
	}
	
	public static void main(String[] args) {
		Constructors c = new Constructors(111,"Harish",100.1f);
		c.display();
		Constructors c1 = new Constructors(121,"Suresh",200.1f);
		c1.display();
		
	}
}
