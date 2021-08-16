/*

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.


*/
import java.io.*;
import java.util.*;

public class span_of_array{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int diff=0;
    int [] x=new int[n];
    for(int i=0;i<n;i++)
    {
        x[i]=input.nextInt();
    }
   
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
    for (int i=0;i<n-1;i++)
    {
    	
    	diff=x[n-1]-x[0];
    }
    System.out.println(diff);
   


    
    
    
    
    
    
    
    
 }

}
