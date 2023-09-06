package hackerRank;
import java.util.*;

public class Treelix_Aug29 {
	
	public static boolean CheckPalindrome(String s) {
		String pal = "";
		boolean status = false;
		StringBuffer sb = new StringBuffer(s);
		pal=pal+sb.reverse();
		
		if(pal.equals(s)) {
			 status= true;
		}else {			
		 status= false;
		}
		return status;
		
	}
	public static void palindromePrint(String s1) {
		ArrayList<String> al1 = new ArrayList<String>();
		for(int i=0;i<s1.length();i++) {
			al1.add(Character.toString(s1.charAt(i)));
		}
		ArrayList<String> al2 = new ArrayList<String>();
		for(int i=0;i<s1.length();i++) {
			int value=s1.length()-i;
			String temp="";
			if(i<value) {
				temp=temp+s1.substring(i, value);
				if(CheckPalindrome(temp) && temp.length()>1) {					
						al2.add(temp);
						temp="";					
				}
				else {
					temp="";
				}
			}
			else {
				break;
			}
			
		}
		

		al1.addAll(al2);
		System.out.println(al1.toString());
		System.out.println("count is : "+al1.size());
	}

	public static void main(String[] args) {
		String s1 = "tacocat"; //[t,a,c,o,c,a,t,tacocat,acoca,coc] - count 10
		String s2 = "tacocal"; //[t,a,c,o,c,a,l,acoca,coc] - count 9
		String s3="book";
		palindromePrint(s1);
		palindromePrint(s2);
		palindromePrint(s3);
	}

}
