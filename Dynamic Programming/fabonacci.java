//by memorization

package Dynamic_programming;

import java.util.Scanner;

public class fabonacci {
	
	public static int fabonaccidp(int n,int[] qb)
	{
		if(n==0||n==1)
		{
			return n;
		}
		if(qb[n]!=0)
		{
			return qb[n];
		}
		
		int fabo1=fabonaccidp(n-1,qb);
		int fabo2=fabonaccidp(n-2,qb);
		int dp=fabo1+fabo2;
		return dp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int qb[]=new int[n+1];
		int p=fabonaccidp(n,qb);
		System.out.println(p);
		
		

	}

}
