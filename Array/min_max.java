import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class min_max {
	
	 static int  min(int arr[],int n)
	{
		int res=arr[0];
		for(int i=1;i<n;i++)
			res=Math.min(res,arr[i]);
		return res;
		
	}
	 static int max(int arr[],int n)
	 {
		int res=arr[0];
		for(int i=0;i<n;i++)
			res=Math.max(res,arr[i]);
		return res;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int arr[]= {12,222,254,265};
	  int n=arr.length;
	  System.out.println("Max element in array is " + max(arr,n));
	  System.out.println("Min element in array is " + min(arr,n));
	  
		

	}

}
