package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Raj_Nov5_Interview {

	public static Set<Integer> uniqueSet(int[] a, int[] b) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int k : a) {
			set.add(k);
		}
		for (int m : b) {
			set.add(m);
		}
		return set;
	}

	public static void removeDuplicates(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<>();
		for (int k : arr1) {
			list.add(k);
		}
		for (int m : arr2) {
			list.add(m);
		}

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (!map.containsKey(list.get(i))) {
				map.put(list.get(i), 1);
			} else {
				map.put(list.get(i), map.get(list.get(i)) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey());
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 3, 4, 5, 6, 7 };
		removeDuplicates(a, b); // output = 1,2,6,7

	}

}
