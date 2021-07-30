//Given an array (or string), the task is to reverse
//the array/string.
import java.util.ArrayList;
import java.util.*;
public class Reverse {
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER NUMBER OF ELEMENTS");
		int n=input.nextInt();
		System.out.println();
		System.out.print("Enter elements  ");
		int [] a =new int[n];
		for(int i=0;i<n;i++)
		{
			
			a[i]=input.nextInt();
		}
		
		System.out.println();
		System.out.print("given ARRAY is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(+a[i]+ " , ");
		}
		System.out.println();
		System.out.print("REVERSED ARRAY IS ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+ " , ");
			
		}
		input.close();
		
		
		
		
	}
	
	

	
}
