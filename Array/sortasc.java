//Java Program to right rotate the elements of an array
import java.util.*;
public class sortasc{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
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
			
			System.out.print(a[i]+ ","); 
			
		}		
		
		
		
		
		
		
	}

}
