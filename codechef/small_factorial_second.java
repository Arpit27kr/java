package hello;
import java.util.*;

public class small_factorial_second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		// your code goes here
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int num=input.nextInt();
		    int fact=1;
		    for(int i=num;i>0;i--)
		    {
		        fact=fact*i;
		       
		    }
		    System.out.print(fact);
		    
		}
		
	}

}




// or ------------------->

/*
  package codechef; // don't place package name! 

import java.util.*;
import java.lang.*;
import java.io.*;

Name of the class has to be "Main" only if the class is public. 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int a[]=new int [n];
    	 for(int i=0;i<n;i++)
    	 {
    	     a[i]=sc.nextInt();
    	 }
    	 
    	 for(int j=0;j<n;j++)
    	 {
    	     
    	     if(a[j]>0)
    	     {
    	     int fact=1;
        	     for(int k=a[j];k>0;k--)
        	     {
                	fact=fact*k;
        	     }
        	     System.out.println(fact);
    	     }
    	     else
                {
                    System.out.println("1");
                }
    	 }
	}
}

 
 
 
 
 
 
 
 
 
 */


