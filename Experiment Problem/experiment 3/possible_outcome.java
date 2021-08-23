/*	Write a program to accept three digits (i.e., 0 - 9) and print all its possible combinations.  
(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132, 
213, 231, 312, 321.)
*/

//1 2 3
//n1 n2 n3
import java.util.*;
public class possible_outcome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		
		for(int i=n1;i<=n3;i++)
		
		{	
		  {
			for (int j=n1;j<=n3;j++)
			{
				if(j!=i) 
				{
					
				for(int k=n1;k<=n3;k++)
					
				if( k!=i && k!=j)
				{
				{
					System.out.println(i+","+j+","+k);
				}
				}
			    }
			}
		}

	 }
	}
}
