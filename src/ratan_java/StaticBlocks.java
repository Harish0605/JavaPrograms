package ratan_java;
//class A{
//	static {
//		System.out.println("static block in class A");
//	}
//}
//class B{
//	static {
//		System.out.println("static block in class B");
//	}
//}

public class StaticBlocks{
	
	static int a=10;
	static int b=20;
	static {
		a=100;
		System.out.println("static block");
	}
	
//	{
//	System.out.println("insta block-1");	
//	}
//	{
//		System.out.println("insta block-2");	
//		}
//	static {
//		System.out.println("static block-1");
//	}
//	static {
//		System.out.println("static block-2");
//	}
//	StaticBlocks(){
//		System.out.println("0-arg cons");
//	}
//	StaticBlocks(int a){
//		System.out.println("1-arg cons");
//	}
//
//	public static void main(String[] args) {
//		new StaticBlocks(10);
//
//	}
//	public static void main(String[] args) throws ClassNotFoundException{
//       Class.forName("B"); 
//       
//}
	public static void main(String[] args) {
	System.out.println(a);
	System.out.println(b);
	

}	
}
