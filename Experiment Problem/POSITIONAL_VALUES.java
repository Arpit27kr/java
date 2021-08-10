/*7.	Write program to print positional values of digits. 
 * Input 21463 output 3, 60, 400, 1000 and 20000.
 */
public class POSITIONAL_VALUES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=21463;
		
		
		
		int rep=0;
		for(int i=n;i>=0;i--)
	{       int k=1;
			
		
			for( k=1;k<=n ;k++)
			{
				int d=(int)Math.pow(10,k-1);
			   rep=(n%10)*d;
			   System.out.print(rep+" , ");
			   n=n/10;
			if(k>n)
			{
				
				   rep=(n%10)*d;
				   System.out.println(rep);
				   n=n/10;
				
			}
			   			   
			}
			
		
			
			
									
	}
	
		
		

}

}
