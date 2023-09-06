public class firstAndLastPositions {
     public static int[] searchRange(int[] nums, int target){
       int nums2[] = new int[2];
         int nums3[]={-1,-1};
        int j=0;
         int count=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
               count++;
                nums2[j]=i;
                j++;
               
            }
            
           
        }
         if(count==0){
             return nums3;
         }else{
             return nums2;
         }
          
    }

     public static void main(String []args){
        int nums[] = {5,7,7,8,8,10};
        int target = 8;             
       searchRange(nums,target);
         int nums1[] = {5,7,7,8,8,10};
         int target1= 6;
       searchRange(nums1,target1);  
        
         
     }
}