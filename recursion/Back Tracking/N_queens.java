package recursion;

import java.util.Scanner;

public class N_queens {
	
	public static void totalpath(int[][] a,int row,String ans)
	{
		
		if(row==a.length)
		{
			System.out.println(ans);
			return;
		}
		
	
		
		for(int col=0;col<a.length;col++)
		{
			if(queensafe(a,row,col)==true)
			{
			 a[row][col]=1;
			totalpath(a,row+1,ans+row+"-"+col+",");
			 a[row][col]=0;
			}
			
		}
		
		
		
	}
	
	public static boolean queensafe(int [][] a,int row,int col)
	{
		for(int i=row-1, j=col-1;i>=0 &&j>=0;i--,j-- )
		{
			if(a[i][j]==1)
			{
				return false ;
			}
			
		}
		
		for(int i=row-1, j=col;i>=0 ;i-- )
		{
			if(a[i][j]==1)
			{
				return false ;
			}
			
		}
		for(int i=row-1,j=col+1;i>=0&&j<a.length ;i--,j++ )
		{
			if(a[i][j]==1)
			{
				return false ;
			}
			
		}
		
	
		return true;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[][]=new int[n][n];
		
		totalpath(a,0,"");
		
		
		

	}

}
