package recursion;

import java.util.Scanner;

public class subsequences_wayup {
	
	public static void printss(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		String rst=str.substring(1);
		
		printss(rst,ans);
		printss(rst,ans+ch);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		printss(str,"");
		

	}

}
