import java.util.Scanner;

/*

1. You are given an array(arr) of integers and a pivot.

2. You have to re-arrange the given array in such a way that all elements
   smaller or equal to pivot lie on the left side of pivot and all elements greater than pivot lie on its right side.

3. You have to achieve this in linear time.

*/
public class partition_of_array {
	
	public static void partition(int arr[],int pivot)
	{
		int i=0;
		int j=0;
		
			while(i<arr.length)
			{
				if(arr[i]>pivot)
				{
					i++;
				}
				else {
					swap(arr,i,j);
					i++;
					j++;
				
				
			}
		}
		
	}
	
	public static void swap(int arr[],int i,int j)
	{
	
		 int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
	}
	 public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY");
		int n=input.nextInt();
		System.out.println("ENTER THE PIVOT USED TO DIFFERENTIATE AN ARRAY");
		int pivot=input.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}

		partition(arr,pivot);
		print(arr);
		

	}

}
