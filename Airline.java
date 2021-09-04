/*
 * Chef has 3 bags that she wants to take on a flight. They weigh A, B, and C kgs respectively. 
 * She wants to check-in exactly two of these bags and carry the remaining one bag with her.

The airline restrictions says that the total sum of the weights of the bags that are checked-in cannot exceed D kgs and
 the weight of the bag which is carried cannot exceed E kgs. Find if Chef can take all the three bags on the flight.
 * 
 * 
 * 
 */





/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Airline
{
    public static void  carried(int a,int b,int c,int d,int e)
    {
    	if(a>=0&&a<=10&&b>=0&&b<=10&&c>=0&&c<=10&&d>=15&&d<=20&&e>=5&&e<=10)
    	{
    	int n1=a+b;
    	int n2=b+c;
    	int n3=a+c;
    	
    		
    	if(n1<d&&n2<d&&n3<d||a<e||b<e||c<e)
    	{
    		System.out.print("YES");
    	}
    	else {
    		System.out.print("No");
    		
    	}
    }
    	
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int T =input.nextInt();
		while(T-- > 0)
		{
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e=input.nextInt();
		carried(a,b,c,d,e);
	}
	}
}
