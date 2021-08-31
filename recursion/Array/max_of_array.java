/*
 * 1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input. 
4. For the purpose complete the body of maxOfArray function. Don't change the signature.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of
 question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you
 */
import java.io.*;
import java.util.*;

public class max_of_array {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int [] arr =new int [n];
        n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        int max=maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
    	if(idx==arr.length)
        {
            return 0;
        }
        int misa=maxOfArray(arr,idx+1);
        if(misa>arr[idx])
        {
            return misa;
            
        }
        
        else
        {
            return arr[idx];
        }
        
    }

}