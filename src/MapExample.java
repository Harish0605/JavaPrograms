import java.util.*;
import java.util.Map.Entry;
public class MapExample {

	public static void main(String[] args) {
		Map<String,String> fruits = new HashMap<>();
        fruits.put("red", "apple");
        fruits.put("black", "grape");
        fruits.put("yellow", "banana");
        fruits.put("green", "guava");
       // System.out.println(fruits.get("black"));
        
        System.out.println(fruits.containsKey("red")); // containsKey and containsValue return type is boolean
        
        System.out.println(fruits.containsValue("guava"));
        
        int size=fruits.size();
        System.out.println(size);
        
//        String s=fruits.remove("green");
//        System.out.println(s);
        //fruits.clear(); -- clear all the contents of Map
        
        for(Map.Entry<String,String> pairEntry: fruits.entrySet()) {
        	System.out.println(pairEntry.getKey()+"----"+pairEntry.getValue());
        }
        
        Set<String> keys = fruits.keySet();
        System.out.println(keys);
        
        Collection<String> values = fruits.values();
        System.out.println(values);
        
        Set<Entry<String, String>> s1 = fruits.entrySet();
        System.out.println(s1);
        
        
//        Set<String> s1 = fruits.entrySet()
//        System.out.println(s1);
        
	}

}
