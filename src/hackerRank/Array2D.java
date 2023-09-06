package hackerRank;

import java.util.*;

public class Array2D {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int len = scan.nextInt();
       	long sum;
    	int count=0;
    	long[] a = new long[len];
    	for(int i=0;i<len;i++) {
    		a[i]=scan.nextLong();
    	}
    	for(int i=0;i<len;i++) {
    		sum=0;
    		for(int j=i;j<len;j++) {
    			sum=sum+a[j];
    			if(sum<0) {
    				count++;
    			}
    		}
    	}
    	System.out.println(count);
    	
    	
    	
    	
    	
       
    }
}
