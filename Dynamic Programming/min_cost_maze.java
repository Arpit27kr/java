package Dynamic_programming;

import java.util.Scanner;

public class min_cost_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=input.nextInt();
			}
			
		}
		int db[][]=new int [n][m];
		for(int i=db.length-1;i>=0;i--)
		{
			for(int j=db[0].length-1;j>=0;j--)
			{
			   if(i==db.length-1 && j==db[0].length-1)
			   {
				   db[i][j]=arr[i][j];
			   }
			   else if(i==db.length-1)
			   {
				   db[i][j]=db[i][j+1]+arr[i][j];
			   }
			   else if(j==db[0].length-1)
			   {
				   db[i][j]=db[i+1][j]+arr[i][j];
			   }
			   else
			   {
				   db[i][j]=Math.min(db[i+1][j], db[i][j+1])+arr[i][j];
			   }
			}
		}
		System.out.println(db[0][0]);
			

	}

}
