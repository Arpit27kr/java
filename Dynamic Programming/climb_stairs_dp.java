//by memorization

package Dynamic_programming;

import java.util.Scanner;

public class climb_stairs_dp {
	
	public static int climb(int n,int []qb)
	{
		if(n==0)
		{
			return 1;
			
		}
		else if(n<1)
		{
			return 0;
		}
		else if(qb[n]>0)
		{
			return qb[n];
		}
		
		int n1=climb(n-1,qb);
		int n2=climb(n-2,qb);
		int n3=climb(n-3,qb);
		
		int cp= n1+n2+n3;
		 qb[n]=cp;
		return cp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int re=climb(n,new int[n+1]);
		System.out.println(re);
	}

}
