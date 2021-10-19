package recursion;

import java.util.Scanner;

public class print_maze_path {
	
	
	public static void mazepath(int sr,int sc,int dr,int dc,String ans)
	{
		if(sr==dr && sc==dc)
		{
			System.out.println(ans);
		}
		else if(sr>dr || sc>dc)
		{
			return;
		}
		
		
		mazepath(sr,sc+1,dr,dc,ans+"h");
		mazepath(sr+1,sc,dr,dc,ans+"v");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		mazepath(1,1,m,n,"");
		
		
		

	}

}
