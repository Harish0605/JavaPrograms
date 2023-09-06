package rahulShetty;

import java.util.ArrayList;

public class compareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 4, 5, 7 };
		int[] b = { 6, 4, 3, 7 };
		ArrayList<Integer> c = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==b[i]) {
				c.add(b[i]);
			}
		}
		Object[] d= c.toArray();
		for(Object ob:d) {
			System.out.println(ob);
		}
		

	}

}
