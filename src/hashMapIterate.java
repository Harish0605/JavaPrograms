import java.util.*;
public class hashMapIterate {

	public static void main(String[] args) {
		
		HashMap<String,Integer>foodTable=new HashMap<String,Integer>();
		foodTable.put("apple juice",1);
		foodTable.put("lemon juice",2);
		foodTable.put("orange juice",3);
		foodTable.put("banana juice",4);
//		for(Map.Entry<String, Integer>set:foodTable.entrySet()) {
//			System.out.println(set.getKey() + " = "
//                    + set.getValue());
//			
//			
//		}
		System.out.println(foodTable);
		

	}

}
