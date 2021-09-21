import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class rearrange_possitive_negative {
	
	public static void rearrange(int arr[])
	{
		int i=0;
		int j=arr.length-1;
		Arrays.sort(arr);
		ArrayList<Integer>res=new ArrayList();
		int k=0;
		while(i<j)
		{
			if(arr[i]<0 && arr[j]>0)
			{
			    res.add(arr[i]);
				res.add(arr[j]);
				
				k++;
				i++;
				j--;
				
				
			}
			else if (arr[j]>0)
			{
				res.add(arr[j]);
				
				j--;
				k++;
			}
			
			else
			{
				res.add(arr[j]);
				j--;
			}
			
		
		}
	
		System.out.print(res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
	    rearrange(arr);
		
		
		
		
	}

}
