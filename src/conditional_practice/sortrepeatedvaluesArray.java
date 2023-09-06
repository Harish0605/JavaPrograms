package conditional_practice;
import java.util.*;
public class sortrepeatedvaluesArray {

	public static void main(String[] args) {
		int[] arr = {3,7,6,1,1,7,7,1,6,1};  //op = 1,1,1,1,7,7,7,6,6,3
		//int[] arr = {2,1,3,2,1,2}; // 
		List<Integer> list_op = new ArrayList<Integer>();        
		List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> m = new LinkedHashMap<Integer,Integer>();
        for(int k:arr){
            if (!(m.containsKey(k))){
                m.put(k,1);
            }else{
                m.put(k,m.get(k)+1);
            }
        }
     
        for(Map.Entry<Integer,Integer> map : m.entrySet()){
        	list.add(map.getValue());        	
          }
        Collections.sort(list);
        Collections.reverse(list);
         for(int s: list) {
        	for(Map.Entry<Integer,Integer> map : m.entrySet()){
        		if(s==map.getValue())  {
 				   while(s!=0) {
 					   list_op.add(map.getKey());
 					 s--;
 				   }
 				   
 			   }	
        	}
        	
        }
      
    	   System.out.println(list_op);
        
        
     

	}

}
