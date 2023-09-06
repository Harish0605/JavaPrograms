
public class reverseTriangle{

     public static void main(String []args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            

            
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }           
            

            System.out.println();
        }
        
     }
}
//    	  int k=0;
//          for(int i=1;i<=5;i++){
//              k=i;
//              while(k!=1){
//               System.out.print(" "); 
//               k--;
//              }
//              for(int j=5;j>=i;j--){
//                 System.out.print("*");  
//              }
//               System.out.println();
//          }
//        
//      }
// }