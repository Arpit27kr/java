import java.util.Scanner;

public class Quick_sort {
	
	public static void quick_sort(int arr[],int lo,int hi )
	{
		if(lo>=hi)
		{
			return;
		}
		int pivot=arr[hi];
		int pi=partition(arr,pivot,lo,hi);
		quick_sort(arr,lo,pi-1);
		quick_sort(arr,pi+1,hi);
		
		
	}
	
	
	public static int  partition(int arr[],int pivot,int lo,int hi)
	{
		int i=lo,j=lo;
		while(i<=hi)
		{
			if(arr[i]>pivot)
			{
				i++;
			}
			else
			{
				swap(arr,i,j);
				j++;
				i++;
			}
			
		}
		 System.out.println("pivot index -> " + (j - 1));
		    return (j - 1);
		    
		    
	}
	
	
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public  static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY");
		int n=input.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}

		quick_sort(arr,0,arr.length-1);
		print(arr);
	}

}
