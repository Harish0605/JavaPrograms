package ratan_java;

public class FirstAndLastIntegerTarget {

	public static void main(String[] args) {
		int[] num = {5,7,7,8,8,10};
		
		int num1[]=new int[2];
		
		int k=0;
		boolean flag = false;
		int target = 8;
		for(int i=0;i<num.length;i++) {
			if(num[i]==target) {
				flag=true;
				
//				System.out.println(i);
				if(flag) {
					num1[k]=i;
					k++;
					
				}
				
				
			}
			
		}
		for(int l:num1) {
			System.out.println(l);
		}

	}

}
