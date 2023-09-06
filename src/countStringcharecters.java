
public class countStringcharecters {

	public static void main(String[] args) {
		 System.out.println("Hello World");
	        String s = "aabbbc";
	        String s1= " ";
	        for(int i=0;i<s.length();i++){
	            int count=1;
	            for(int j=0;j<s.length();i++){
	                if(s.charAt(i)==s.charAt(j)){
	                    count++;
//	                    s1=s1+s.charAt(j)+count;
	                }
	                
	            }System.out.println(s1);
	            
	        }
}
}
