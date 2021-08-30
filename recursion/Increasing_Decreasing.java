/*
1. You are given a positive number n. 
2. You are required to print the counting from n to 1 and back to n again.
3. You are required to not use any loops. Complete the body of pdi function to achieve it.
   Don't change the signature of the function.

    Note -> The online judge can't force you to write the function recursively but that is what the 
            spirit of question is.Write recursive and not iterative logic. 
            The purpose of the question is to aid learning recursion and not test you.
  
 */
import java.util.*;
public class Increasing_Decreasing {
	
	public static void inde(int n)
	

	     {if(n>0) {
		    System.out.println(n);
		    inde(n-1);
		    System.out.println(n);
	     }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		inde(n);

	}
	

}
