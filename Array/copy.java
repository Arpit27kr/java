import java.util.*;

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=input.nextInt();
		System.out.println("Enter the elements");
		int [] arr=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		
		System.out.println();
		
		System.out.println("ENTERED ELEMENTS IN ARRAY 1 ARE ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" , ");
		}
		int []arr2=new int[n];
		for(int i=0;i<n;i++)
		{
		      arr2[i]=arr[i];
		}
		System.out.println();
		System.out.println("ELEMENTS IN ARRAY 2 -----> ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr2[i]+",");
		}
		System.out.println();
		System.out.println();
		System.out.println("Array Copied Sucessfully");
		
		

	}

}
