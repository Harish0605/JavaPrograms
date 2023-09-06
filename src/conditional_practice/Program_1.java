package conditional_practice;
import java.util.*;
public class Program_1 {
	
	public static void oddEven(int i) {	//Verify any given number is even or odd	
		if(i%2==0) {
			System.out.println("The given number is Even Number : "+i);			
		}
		else {
			System.out.println("The given number is Odd Number : "+i);
		}		
		
	}
	
	public static void examResult(int i) {
		if(i>=35) {
			if(i>35 && i<=70) {
				System.out.println("Student secured Third Class");
			}
			if(i>70 && i<=85) {
				System.out.println("Student secured Second Class");
			}
			if(i>85) {
				System.out.println("Student secured First Class");
			}
			
			if(i==35) {
				System.out.println("Student secured Pass marks");
			}
			
		}else {
			System.out.println("Student is failed");
		}
	}
	
	public static void identifyWeekend(String s) {
		if(s.contentEquals("Saturday") || s.contentEquals("Sunday")) {
			System.out.println("Yayy, It's a weekend");
		}
		else if(s.contentEquals("Monday") || s.contentEquals("Tuesday")
				|| s.contentEquals("Wednesday") || s.contentEquals("Thursday")) {
			System.out.println("Uff, Its a weekday");
		}else {
			System.out.println("Not a valid day");
		}
	}

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = scan1.nextLine();
		identifyWeekend(day);
		
		
		
		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num = scan.nextInt();		
		//oddEven(num); 
		//examResult(num);
		
	}

}
