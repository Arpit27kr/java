package recursion;

import java.util.Scanner;

public class Flood_fill_up {
	
	public static void floodpath(int arr[][],int row,int col,String ans,boolean visited[][])
	{
	   
		if(row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || 
		         arr[row][col] == 1 || visited[row][col] == true)
		{
		
			return ;
		}
		else  if(row==arr.length-1 && col==arr[0].length-1 )
		{
			System.out.println(ans);
			return;
			
		}
		visited[row][col]=true;
		floodpath(arr,row-1,col,ans+"t",visited);
		floodpath(arr,row,col-1,ans+"l",visited);
		floodpath(arr,row+1,col,ans+"d",visited);
		floodpath(arr,row,col+1,ans+"r",visited);
		visited[row][col]=false;
		
		
		
		
	}
	
	public static void main(String [] args)
	{
		
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		
		int n=input.nextInt();
		int arr[][]=new int[m] [n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
		
		       arr[i][j]=input.nextInt();
			}
		}
		boolean visited [][]=new boolean [m][n];
		floodpath(arr,0,0,"",visited);
		
		
		
	}

}
