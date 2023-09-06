package conditional_practice;
import java.util.*;
public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			 int x = sc.nextInt();
		     int y = sc.nextInt();
		     int z = x/y;
		     System.out.println(z);
		}
		catch(Exception e) {
		System.out.println(e.getClass().getName());

		}
		
       
        
	}

}
