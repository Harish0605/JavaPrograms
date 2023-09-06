package japneetSachdeva;
//Find maximum difference
public class MaximumDifference {
	
	public static void repeatElements(int[] arr) {
		int diff=0;int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					diff = arr[j] - arr[i];
					if(diff > max) {
						max = diff;
					}
				}
			}
		}
		System.out.println(max);

	}

	public static void main(String[] args) {
		int[] arr1 = {2, 3, 10, 6, 4, 8, 1};
		int[] arr = {7, 9, 5, 6, 3, 2};
		repeatElements(arr1);
		repeatElements(arr);
        
	}

}
