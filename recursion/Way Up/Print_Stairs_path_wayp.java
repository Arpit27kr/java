package recursion;

import java.util.Scanner;

public class Print_Stairs_path_wayp {
	
	
	public static void path(int ques,String ans)
	{
		
		if(ques<0)
		{
			return ;
		}
		else if(ques==0)
		{
			System.out.println(ans );
			return;
		}
		
		path(ques-1,ans+"1");
		path(ques-2,ans+"2");
		path(ques-3,ans+"3");
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int str=input.nextInt();
		path(str,"");
		
		
		

	}

}
