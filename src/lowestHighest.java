
public class lowestHighest {
	
	public static int middleNumber(int a[]) {
		int count;int index=0;
        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=0;j<a.length;j++){
                if(j<i){
                    if(a[j]<a[i]){
                        count++;
                    }
                }
                else if(j>i){
                    if(a[j]>a[i]){
                        count++;
                    }
                }
            }
            if(count==a.length-1){
            System.out.println("The value is "+a[i] +" present at index "+i);
            index=i;
        }
        }return index;
        
	}

	public static void main(String []args){
       
        int[] a={5,3,1,2,6,9,8,7};
        middleNumber(a);
        
        
     }

}
