package hello;

import java.util.Scanner;

public class Sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		int s=input.nextInt();
		int arr2[]=new int[s];
		for(int i=0;i<s;i++)
		{
			arr2[i]=input.nextInt();
		}
		int arr3[]=new int[Math.max(n, s)];
				
		int i=0;
		int j=0;
		int k=0;
		while(i<arr.length && j<arr2.length)
		{
				if(i<arr.length && j<arr.length)
				{
					arr3[k]=arr[i]+arr2[j];
					i++;
					j++;
					k++;
				}
				
				
			}
		while(i<arr.length)
		{
			arr3[k]=arr[i];
			i++;
			k++;
		}
		while(j<arr2.length)
		{
			arr3[k]=arr2[j];
			j++;
			k++;
			
		}
		
		for(int sp=0;sp<(Math.max(n, s));sp++)
		{
			System.out.println(arr3[sp]);
		}
		
		
		}
		
		
		

	}


