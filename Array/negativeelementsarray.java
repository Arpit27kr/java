
public class negativeelementsarray {
	
	public static void sort(int a[])
	{
		int n=a.length;
		int temp;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				if(i!=j)
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				j++;
			}
		}
			
	}
	public static void show(int a[],int n)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(a[j]+",");
		}
	}
	
	public static void main(String[] args)
	{
		int[]a= {-1,2,-3,-4,5,7};
		int n=a.length;
		sort(a);
		show(a,n);
	}

}
