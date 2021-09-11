
import java.util.*;
public class Max_element{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     int max=0;
     int [] a=new int [n];
     for (int i=0;i<n;i++)
     {
    	 a[i]=input.nextInt();
     }
		
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
		
		if(a[i]<a[j])		
		{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;

		}		           
		}
			max=a[0];
			
			
			
		}	
		System.out.print("THIRD LARGEST NUMBER IS -------------------->"+max); 
		
		
		
		
		
		
	}

}
