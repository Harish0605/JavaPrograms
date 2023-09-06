package ratan_java;

public class SampleFibonacci {


	     public static void main(String []args){
	         int n1=0,n2=1;
	         int n3=1;
	        
	         while(n3<10){
	              n3=n1+n2; //0,0
	             n1=n2; //n2=0,
	             n2=n3;//n3=0
	            
	             System.out.println(n3); 
	         }
	        
	     }
	}
