package Dynamic_programming;
import java.util.*;

public class climb_stairs_tabulation_dp {
	
	public static int climb_tabulation(int n)
	{
		int []dp=new int[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				dp[i]=dp[i-1];
			}
			else if(i==2)
			{
				dp[i]=dp[i-1]+dp[i-2];
			}
			
			else
			{
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
			}
			
		}
		return dp[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int p=climb_tabulation(n);
		System.out.println(p);

	}

}
