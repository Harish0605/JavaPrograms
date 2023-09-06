package hackerRank;
import java.util.*;

public class PhoneDirectoryMap {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int n= Integer.parseInt(in.nextLine());

	     HashMap<String, Integer> hMap = new HashMap<>(); 

	     //populate HashMap
	     for(int i=0;i<n;i++){
	         String name = "";
	         name += in.nextLine();
	         int phone = Integer.parseInt(in.nextLine());
	         hMap.put(name, phone);
	     }

	     //take in and check queries against Hashmap  
	     while(in.hasNext()) {
	         String s = in.nextLine();
	         if (hMap.containsKey(s)) {
	             System.out.println(s + "=" + hMap.get(s));
	         } else {
	             System.out.println("Not found");
	         }
	     }
	}

}
