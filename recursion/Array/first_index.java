/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x. 
4. You are required to find the first index at which x occurs in array a.
5. If x exists in array, print the first index where it is found otherwise print -1.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. 
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

*/

   import java.util.Scanner;

public class first_index {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  Scanner input=new Scanner(System.in);
	        int n=input.nextInt();
	        
	        int [] arr =new int [n];
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=input.nextInt();
	        }
	        int x=input.nextInt();
	        int index=firstindex(arr,0,x);
            System.out.println(index);
	}
	public static int firstindex(int [] arr,int idx,int x)
	
	{ 
		if (idx==arr.length)
	{
		return -1;
	}
	
	
	if(arr[idx]==x)
	{
	    return idx;
	    
	}
	else 
	{
	    int fn1=firstindex(arr,idx+1,x);
	    return fn1;
	}
	
		
	}
}

