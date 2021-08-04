//Write a program to cyclically rotate an array by one.
public class cyclicarray {

	public static void swap(int a[])
	{
		int n=a.length;
		
		int temp;
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			a[i]=a[n-1];
			a[n-1]=temp;
		}
		
	}
	public static void show(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
	}
	public static void main(String[] args)
	{
		int n;
		int []a= {1,2,3,4,5};
		swap(a);
		show(a);
	}
}
