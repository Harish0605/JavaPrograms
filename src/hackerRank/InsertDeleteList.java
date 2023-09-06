package hackerRank;
import java.util.*;
public class InsertDeleteList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int listSize = scan.nextInt();
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<listSize;i++) {
			al.add(scan.nextInt());
		}
		int operations = scan.nextInt();
		for(int i=0;i<operations;i++) {
			String s = scan.next();
			if(s.equals("Insert")) {
				int index = scan.nextInt();
				int value = scan.nextInt();
				al.add(index, value);
			}
			else if(s.equals("Delete")) {
				int index = scan.nextInt();
				al.remove(index);
			}
		}
		System.out.println(al.toString());
		
        
	}

}
