import java.util.Scanner;
public class Largest_element 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n=input.nextInt();
		int [] a=new int [n];
		System.out.print ("Enter the elements  of array");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		/*
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{	
				if(a[i]<a[j])
			{		
				int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			}
		}
		System.out.println("Largest element in array is " +a[0]);
		*/
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
					{
				       max=a[i];
					}
		}
		System.out.println("Largest element in array is " +max);
		
		
		
		
		
		
		
		
}
}
		