import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class exampleClass {

	 public static void main(String args[]) {
//	      String str ="123AB456CD";
//	      String s1="";
//	      String s2="";
//	     for(int i=0;i<str.length();i++){
//	         if(str.charAt(i)>='0' && str.charAt(i)<='9'){
//	             s1=s1+str.charAt(i);
//	         }
//	         else{
//	             s2=s2+str.charAt(i);
//	         }
//	         
//	     }
//	      System.out.println(s1+s2);
		
//		     String countries[] = {"India","Germany","Africa","Newzealand"};
//		     ArrayList<String> al = new ArrayList<String>();
//		     for(int i=0;i<countries.length;i++){
//		         al.add(i, countries[i]);
//		       
//		         System.out.println(al.get(i));
//		     }
//		     
//		     Collections.sort(al);
//		     System.out.println(al);
		       
//		     int size = countries.length;  
//		        
//		     for(int i = 0; i<size-1; i++)   
//		     {  
//		     for (int j = i+1; j<countries.length; j++)   
//		     {  
//		     
//		     if(countries[i].compareTo(countries[j])>0)   
//		     {  
//		      
//		     String temp = countries[i];  
//		     countries[i] = countries[j];  
//		     countries[j] = temp;  
//		     }  
//		     }  
//		     }  
//		      
//		     System.out.println(Arrays.toString(countries));  
		      
		       
		 ArrayList < Integer > arraylist = new ArrayList < Integer > ();

	      arraylist.add(10010);
	      arraylist.add(5);
	      arraylist.add(4);
	      arraylist.add(2);

	      for (int i = 0; i < arraylist.size(); i++) {

	          for (int j = arraylist.size() - 1; j > i; j--) {
	              if (arraylist.get(i) > arraylist.get(j)) {

	                  int tmp = arraylist.get(i);
	                  arraylist.set(i,arraylist.get(j)) ;
	                  arraylist.set(j,tmp);

	              }

	          }

	      }
	      for (int i: arraylist) {
	          System.out.println(i);
	      }     
		     
		 
	 			 
		 }
		     
		    
	    }


