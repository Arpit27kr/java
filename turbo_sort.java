package hello;
import java.util.*;
public class turbo_sort {
	
	public static void display(int arr[])
	{
		for(int  val:arr)
		{
			System.out.println(val);
		}
		
	}

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
			while(t-->0)
			{
				
				int n=input.nextInt();
				int temp=0;
				int []arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=input.nextInt();
				
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
			
			if(arr[i]>arr[j])		
			{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

			}		           
			}
				
				System.out.println(arr[i]); 
				
			}	
		
		
	}
	}
}
