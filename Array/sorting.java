/*Write a program to sort the given array and 
 * Find the Kth largest and Kth smallest number in an array
 */

import java.util.*;
public class sorting {
	public static void main(String[] args)
	{
	int n;
	Scanner input=new Scanner(System.in);
	System.out.print("enter the number of  elements : ") ;
	
	n=input.nextInt();

	int []x= new int[n];
	System.out.println();
	System.out.print("ENTER ELEMENTS  : ");
	for(int i=0;i<n;i++)
    {
    	x[i]=input.nextInt();
    }
	
	 System.out.println();
	 input.close();
	 System.out.println();
	 System.out.print("sorted array is ");
	 for(int i=0;i<n-1;i++)
	 {
		 for(int j=i+1;j<n;j++)
		 {
			 if(x[i]>x[j])
			 {
				 int temp;
				 temp=x[i];
				 x[i]=x[j];
				 x[j]=temp;
				 
			 }
			 
			 
		 }
		 
	 }
	 for(int i=0;i<n;i++)
	 {
		 System.out.print(x[i]+ " , " );
	 }
	 
	 for(int i=0;i<n;i++)
	 {	 
	  System.out.println();
	  System.out.print("MAX array in element is :  " +x[n-1]);
	  System.out.println();
	  System.out.print("MIN element in array is : " +x[0]);
	  break;
	 }
	
	
 
	
	
	}
}
