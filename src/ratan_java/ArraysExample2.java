package ratan_java;

public class ArraysExample2 {

	public static void main(String[] args) {
		String[] s = new String[5];
		s[0]="aaa";
		s[1]="bbb";
		s[2]="ccc";
		s[3]="ddd";
		s[4]="eee";
		String[] s1 = new String[5];
		String[] s2 = new String[5];
		//copy even index elements into s1 and odd index elements into s2
		for(int i=0;i<s.length;i++) {
			if(i%2==0) {
				s1[i]=s[i];
			}else {
				s2[i]=s[i];
			}
		}
		for(String g:s1) {
			System.out.println(g);
		}
		System.out.println("*************");
		for(String d:s2) {
			System.out.println(d);
		}
		
		}

	}


