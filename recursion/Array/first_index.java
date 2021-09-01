import java.io.*;
import java.util.*;

public class first_index {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int x=input.nextInt();
        int [] arr =new int [n];
        n=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
       int index= firstIndex(arr,0,x);
       System.out.println(index);
    }

    public static int firstIndex(int[] arr, int idx, int x){
    	
    	
    	if(arr[idx]==x)
    			{
    				return idx;
    			}
    	else {
    		int fn1=firstIndex(arr,idx,x);
    		return fn1;
    		
    	}
    	
        
        
        
    }

}