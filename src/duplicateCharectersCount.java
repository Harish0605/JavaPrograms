
public class duplicateCharectersCount {

	public static void main(String args[]) {
	     String str = "hcl-techsh";
	     int count;
	    
	     for(int i=0;i<str.length();i++){
	         count =0;
	         for(int j=i+1;j<str.length();j++){
	             if(str.charAt(i)==str.charAt(j)){
	                 count++;
	                   }
	         }if(count==1) {
	        	 System.out.println(count+"  "+str.charAt(i));
	         }
		      
	       
	      
	    }

	}}
