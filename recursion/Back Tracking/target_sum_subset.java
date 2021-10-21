package recursion;
import java.util.*;
public class target_sum_subset {
	
	public static void target(int []arr,int idx,String subset,int sos ,int tar)
	{
		
		if(idx==arr.length)
		{
			if(sos==tar)
			{
				System.out.println(subset+".");
			}
			return;
		}
		else if(idx<0||idx>arr.length||sos>tar)
		{
			return;
		}
		
		target(arr,idx+1,subset+arr[idx]+",",sos+arr[idx],tar);
		target(arr,idx+1,subset,sos,tar);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		int tar=input.nextInt();
		target(arr,0,"",0,tar);
		
		
		
	}

}
