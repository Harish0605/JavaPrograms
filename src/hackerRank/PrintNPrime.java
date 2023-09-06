package hackerRank;

import java.util.Scanner;

public class PrintNPrime {
	
	public static boolean Prime(int num) {
		int count =0;
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}				
			}
			if(count==2) {				
				return true;
			}
			else {				
				return false;
			}
			
		}
		else {			
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		int count=0;
		while(count<=n) {			
			if(Prime(i)) {
				System.out.println(i);
				count++;
			}
			i++;
			
		}
	}

}
