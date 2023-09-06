package string_Practice;

public class Assignment_Strings_4 {

	public static void main(String[] args) {
		String s1 = "New York";
		String s2 = "NWYR";
		String[] arr=s2.split("");
		String op = "";
		s1=s1.toUpperCase();
		for(int i=0;i<arr.length;i++) {
			if(s1.contains(arr[i])) {
				op = op + arr[i]+ "+";
				
			}
		}
		System.out.println(op); //N+W+Y+R+
		
		String fName = "Steve";
		String lName = "Jobs"; // Outout = Jobs,S
        String out = "";
        String a = "";
        for(int i=0;i<lName.length();i++) {        	
        	a = a + lName.charAt(i);
        }
        out = a+ ","+fName.charAt(0);
        
        System.out.println(out);
        
	}

}
