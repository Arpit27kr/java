import java.util.*;
public class count_inversion {
	
	public static void swap(int a[])
	{
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					count++;
					System.out.println("Swapping " +i+" with " +j );
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		swap(a);

	}

}
