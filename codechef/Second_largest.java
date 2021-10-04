package hello;

import java.util.Scanner;
import java.util.Stack;


public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=3;
		int arr[]=new int [n];
		for(int i=0;i<3;i++)
		{
			 arr[i]=input.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<=2;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println(arr[1]);
		
			    	
			    
	}

}




// --------------------------------->>>>>>>>>>>>>>>>>>> or 



/*
 	Scanner scn = new Scanner(System.in);
	
		int T = scn.nextInt();
		
		for (int i = 0; i < T; i++){
		    int a = scn.nextInt();
		    int b = scn.nextInt(); 
		    int c = scn.nextInt();
		    
		    if (a > b && a < c || a > c && a < b){
		        System.out.println(a);
		    } else if (b > a && b < c || b > c && b < a){
		        System.out.println(b);
		    } else {
		        System.out.println(c);
		    } 
 */


