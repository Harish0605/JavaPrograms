import java.util.HashMap;

public class arrangeZeroesToEnd {

	 public static void main(String []args){
	       
//	        int a[]={0,1,0,3,0,4,5,8};
//	        int temp=0;
//	        for(int i=0;i<a.length;i++){
//	            for(int j=i+1;j<a.length;j++){
//	               if(a[i]==0 && a[j]!=0 ){
//	                  
//	                    temp=a[j];
//	                    a[j]=a[i];
//	                    a[i]=temp;
//	                  
//	               } 
//	            }
//	        }
//	        for(int i=0;i<a.length;i++){
//	            System.out.println(a[i]);
//	        }
//	        
		 String s="aabbbcc";
		  int count= 1;
		    int x;
		    

		    for (x = 0; x <s.length()-1; x++) {
		        if (s.charAt(x) != s.charAt(x + 1) && count == 1) {
		            System.out.print(s.charAt(x));
		            System.out.print(count);
		        }

		        else if (s.charAt(x)== s.charAt(x + 1)) {
		            count++;
		        }

		        else if (s.charAt(x) != s.charAt(x + 1) && count >= 2) {
		            System.out.print(s.charAt(x));
		            System.out.print(count);
		            count = 1;
		        } 
		        
		    }System.out.print(s.charAt(x));
		    System.out.println(count);
		    
		} 
}
	      
	     

