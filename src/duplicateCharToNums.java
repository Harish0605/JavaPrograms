
public class duplicateCharToNums {

	  public static void main(String []args){
	       
	       String s="aabbbcc";
	       String temp = "";
	       for(int i=0;i<s.length();i++){ //i=0,i=1,i=2
	           int count =1;
	           for(int j=i+1;j<s.length();j++){//j=1,j=2,j=3,j=4,j=5--j=2,3,4,5--j=3,j=4
	               if(s.charAt(i)==s.charAt(j)){//temp=a2,temp=a2b2 
	                 count++;  
	                temp=temp+s.charAt(i)+count;
	                
	               
	               }
	               else if(s.charAt(i)!=s.charAt(j)){
	                
	                  break;
	               }
	               else  {
	            	   temp=temp+s.charAt(i)+count;
	            	   
	               }
             }
	       }
	       System.out.println(temp);
	     }

}
