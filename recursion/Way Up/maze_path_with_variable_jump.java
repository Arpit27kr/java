package recursion;

import java.util.Scanner;

public class maze_path_with_variable_jump {
	
	public static void path(int arr[][],int sr,int sc,int dr,int dc,String ans)
	{
		if(sr>dr || sc>dc)
		{
			return;
		}
		else if(sr==dr && sc==dc)
		{
			System.out.println(ans);
			return;
		}
		
		for(int move=1;move<=dc-sc;move++)
		{
			path(arr,sr,sc+move,dr,dc,ans+"h"+move);
		}
		
		for(int move=1;move<=dr-sr;move++)
		{
			path(arr,sr+move,sc,dr,dc,ans+"v"+move);
		}
		
		for(int move=1;move<=dr-sr&&move<=dc-sc;move++)
		{
			path(arr,sr+1,sc+move,dr,dc,ans+"d"+move);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		int arr[][]=new int[m][n];
		path(arr,1,1,m,n,"");

	}

}
