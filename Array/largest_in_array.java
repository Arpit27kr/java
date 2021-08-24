//Write a program to find the largest in a array of size 5
public class largest_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,9,82,78,54};
		int n=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println("Largest element in array is : "+a[i]);
			
			break;
			
		}

	}

}
