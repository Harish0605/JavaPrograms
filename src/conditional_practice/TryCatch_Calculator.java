package conditional_practice;
import java.util.Scanner;

public class TryCatch_Calculator {
	
	public static int power(int n, int p) throws Exception {
		int result=1;
       if(n==0 && p==0) {
    	   throw new Exception("n and p should not be zero");
       }
       else if(n<=0 || p<=0){
    	   throw new Exception("n or p should not be negative");  
       } 
       
       else {
    	    result = (int) Math.pow(n,p);  
       }
        	
       
        
        return result;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	    
	    
	        while (in .hasNextInt()) {
	            int n = in .nextInt();
	            int p = in .nextInt();
	            
	            try {
	                System.out.println(TryCatch_Calculator.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);	     

	} 

}
	       
	}
}

