package ratan_java;

public class WrapperClass {

	public static void main(String[] args) {
		int a =10, b=20;
		String s = String.valueOf(a);
		System.out.println(s);
		String s1 = String.valueOf(b);
		float k = Float.parseFloat(s1);
		double d = Double.parseDouble(s);
		System.out.println(k);
		System.out.println(d);
		//conversion from Stringbuffer to STring
		StringBuffer sb = new StringBuffer("harish");
		String s2= sb.toString();
		System.out.println(s2);
		//String to StringBuffer
		String s3= "kumar";
		StringBuffer sb2 = new StringBuffer(s3);
		System.out.println(sb2.reverse());
		
		//wrapper
		Integer f = new Integer(100);
		double x = f.doubleValue();
		
		
		System.out.println(x);
		
		

	}

}
