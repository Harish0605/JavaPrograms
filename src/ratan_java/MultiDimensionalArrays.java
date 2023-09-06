package ratan_java;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int[][] a = {{10,20,30},{1,3,5}};
		//printing multi dimension array values using for each loop
		for(int[] k:a) {
			for(int d:k) {
				System.out.println(d);
			}
		}
		System.out.println("************");
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		
		

	}

}
