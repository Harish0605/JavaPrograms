import java.util.Arrays;
public class mergeTwoSortedArrays {
	
	public static void mergeArray(int a[], int b[]) {
		int j=0,k=0;
		int c[] = new int[a.length+b.length];
		for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[j];
                 j++;
                
            }
            else{
                c[i]=b[k];
                k++;
            }
            
        }
        Arrays.sort(c);
       System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		
		 int a[] = {1,3,5,7,9};
	        int b[] = {2,4,6,8};
	        int c[]= {4,5,6};
	        int d[] = {7,8,8,9};
	     mergeArray(a, b); 
	     mergeArray(c, d); 
	        
	       

	     }
	}