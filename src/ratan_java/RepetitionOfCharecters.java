package ratan_java;

public class RepetitionOfCharecters {

	public static void main(String[] args) {
		 String s = "aabccdee";
		 int count =1;
         String temp ="";
         for(int i=0;i<s.length()-1;i++){
        	 
             if(s.charAt(i)==s.charAt(i+1)){
                 count++;
             }
             else if(s.charAt(i)!=s.charAt(i+1)){
                temp=temp+s.charAt(i)+count;
                count=1;
                
             }
             else if(s.charAt(i)==s.charAt(i+1) && count>2){
                 temp=temp+s.charAt(i)+count;
                 count=1;
                 
              }
           
         }
         temp= temp+s.charAt(s.length()-1)+count;
     	    System.out.println(temp);
        
     }

	}


