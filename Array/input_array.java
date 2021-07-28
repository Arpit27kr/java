import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class input_array {
	 
	static int min(int x[],int n)
	{
		int rev=0;
		for(int i=1;i<n;i++)
		{
		    rev=Math.min(rev,x[i]);	
		}
		return rev;
	}

	
	public static void main(String[] args)
	{
	int n;
	
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the number of elements you want to enter");
	n=input.nextInt();
	System.out.println("enter the number you want to enter"  );
	
	int [] x=new int[n];
	for(int i=0;i<n;i++)
	{
		
		x[i]=input.nextInt();		
	}
	
	input.close();
	System.out.print("array elements are :");  //array elements
	for(int i=0;i<n;i++)
	{
		System.out.print( +x[i]+ "," );
	}
	
	System.out.println();
	
	Arrays.sort(x);                  // sorting of array
	System.out.print("sorted array is : ");
	for(int i=0;i<n;i++)
	{
		System.out.print( +x[i]+ ",");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
