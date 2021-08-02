import java.util.*;




public class Sorting0_1_2 {
	
	public static void sort(int[] a)
	{
		int start=0;
		int mid=0;
		int end=a.length-1;
		while(mid <= end)
		{
			switch(a[mid]) {
			case 0:{
				swap(a,start,mid);
				start++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			
			case 2:{
				swap(a,mid,end);
				end--;
				break;
			}
		}
	}
		
}
	private static void swap(int[]a,int start,int end)
	{
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
	}
	
	public static void main(String[] args)
	{
		int [] a= {0,1,1,0,1,2,0,1,2};
		sort(a);
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ ",");
		}
	}
	
	

}

