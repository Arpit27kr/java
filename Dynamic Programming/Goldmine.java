package Dynamic_programming;
import java.util.*;

public class Goldmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		int arr[][]=new int [m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
			arr[i][j]=input.nextInt();
			}
		}
		int dp[][]=new int [arr.length][arr[0].length];
		for(int j=arr[0].length-1;j>=0;j--)
		{
			for(int i=arr.length-1;i>=0;i--)
			{
				if(j==arr[0].length-1)
				{
					dp[i][j]=arr[i][j];
				}
				else if(i==0)
				{
					dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+arr[i][j];
				}
				else if(i==arr.length-1)
				{
					dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1])+arr[i][j];
				}
				else
				{
					dp[i][j]=arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));
				}
			}
		}
		int max=arr[0][0];
		for(int i=1 ;i<=arr.length-1;i++)
		{
			max=Math.max(dp[i][0],max);
			
		}
		System.out.println(max);

	}

}
