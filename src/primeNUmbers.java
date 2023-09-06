
public class primeNUmbers {

	public static void main(String args[]) {
		int count=0;
		int i=2;
		while(i>0)
		{
			for(int j=2;j<=i;j++) 
			{
				if(i%j==0) 
				{
					if(i==j) 
					{
						System.out.println(i);
						count++;
						break;
					}
					else 
						break;

				}
			}
			i++;
			
			if(count==100) 
				break;


		}
	}
}
