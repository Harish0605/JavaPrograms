package string_Practice;

public class PoolMemory {

	public static void main(String[] args) {
		String s1="hello";// Stored in Pool Memory
		String s2=new String("hello");// Stored in Heap Memory
		String s3="hello"; 
		System.out.println(s1==s2); //False
        System.out.println(s1==s3); //True
        //Here S1==S3 because both points out to same variable in pool memory 
        
        String s4=new String("hello");
        String s5=new String("text");
        System.out.println(s2==s4); // false
        //In Heap Memory, always separate objects gets created hence 
        //even if the strings are same but separate objects gets created 
        //hence both reference will be different
        
        System.out.println(s1.equals(s3)); 
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s4));
        System.out.println(s2.equals(s5)); 
        System.out.println("______________________________________");
        
        StringBuffer sb1 = new StringBuffer("harish");
        StringBuffer sb2= new StringBuffer("harish");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1==sb2);
        
        
        System.out.println(sb1.toString().equals(sb2.toString()));
        
	}

}
