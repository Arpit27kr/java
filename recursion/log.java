/*
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function.

Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.

Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
 Write recursive and not iterative logic.
 The purpose of the question is to aid learning recursion and not test you.

*/

/*                                                     WITHOUT RECURSION

import java.io.*;
import java.util.*;

public class log {

    public static void main(String[] args) throws Exception {
        // write your code here
    	Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int n=input.nextInt();
        int temp=power(x,n);
        System.out.println(temp);
    }

    public static int power(int x, int n){
        if(n%2==0)
        {
            int fnc=(int)Math.pow(x,n/2);
             int fnc2=(int)Math.pow(x,n/2);
             int fnc3=fnc*fnc2;
             return fnc3;
        }
        else
        {
        	int fnc4=(int)Math.pow(x,n/2);
        	int fnc5=(int)Math.pow(x,n/2);
        	int fn6=fnc4*fnc5*x;
        	return fn6;
        }
        
    }

}
*/

//                                 WITH RECURSION
import java.io.*;
import java.util.*;

public class log {
	public static int power(int x,int n)
	{
	if(n==0){
	return 1;
	}
	int fnc=power(x,n/2);
	int fnc2=fnc*fnc;
	if(n%2==1)
	{
	     fnc2=fnc*fnc*x;
	} 
	return fnc2;
	}

    public static void main(String[] args) throws Exception {
    	
      Scanner input=new Scanner(System.in);
      int x=input.nextInt();
      int n=input.nextInt();
      int temp=power(x,n);
      System.out.println(temp);
    	
    	
    }
    
}













