package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSubstring {
	
	public static String getSmallestAndLargest(String s, int k) {
	    String smallest = "";
	    String largest = "";
	    java.util.List <String> li=new java.util.ArrayList <String>();
	    int temp=k;
	    for(int i=0;i<=((s.length())-temp);i++)
	    {           
	        li.add((String)s.substring(i,k));
	        k++;
	    }
	    java.util.Collections.sort(li);
	    smallest=(String)li.get(0);
	    largest=(String)li.get(li.size()-1);

	    return smallest + "\n" + largest;
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();       
        System.out.println(getSmallestAndLargest(s, k));
    
	}

}
