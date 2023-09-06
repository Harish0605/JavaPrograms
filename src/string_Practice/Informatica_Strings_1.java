package string_Practice;
public class Informatica_Strings_1 {

	public static void main(String[] args) {
		String ip = "Australia\n"+"China\n"+"India\n"+"2 5 8 10\n"+"Japan\n"+"3 7 9 13";
		String op ="";
		String[] str = ip.split("\n");
		for(int i=0;i<str.length;i++) {
			 
			 String s = str[i];			 
			 if(str[i].contains(" ")) {	 
				 String a ="";
		            String[] ar= str[i].split("\\s");
		            for(int k=ar.length-1;k>=0;k--){
		            		a=a+ar[k]+" ";
		               }
		            op= op +a.trim() +"\n";
						
					}else {
						String a="";

					            for(int j=s.length()-1;j>=0;j--) {
									
									a=a+s.charAt(j);
									
								}
					            op=op+a+"\n";

					}
		
			
			}
		System.out.println(op);

	}

}
