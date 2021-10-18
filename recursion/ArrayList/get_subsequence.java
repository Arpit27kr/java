package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class get_subsequence {
	
	public static ArrayList<String> subsequence(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String>bres=new ArrayList<>();
			bres.add(" ");
			return bres ;
		}
		else if(str.length()<0)
		{
			ArrayList<String>bres=new ArrayList<>();
			
			return bres ;
		}
		char ch=str.charAt(0);
		
		String rest=str.substring(1);
		
		ArrayList<String>rec=subsequence(rest);
		
		ArrayList<String>mres=new ArrayList<>();
		for(String rst:rec)
		{
			mres.add(rst);
		}
		for(String tst:rec)
		{
			mres.add(ch+tst);
		}
		return mres;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		ArrayList<String> fi=subsequence (str);
		System.out.println(fi);
		
		

	}

}
