package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class maze_path_with_jumps {
	
	
	
	
	public static ArrayList<String> getpathjump(int sr,int sc ,int dr,int dc)
	{
		if(sr==dr &&dc==sc)
		{
           ArrayList<String>bres=new ArrayList<>();
           return bres;
		}
		if(sr>dr || sc>dc)
		{
			return new ArrayList<>();
		}
		ArrayList<String>path=new ArrayList<>();
		for(int hm=1;hm<=dc-sc;hm++)
		{
			ArrayList<String>hpath=getpathjump(sr,sc+hm,dr,dc);
			for(String str:hpath)
			{
				path.add("h"+ hm + str);
			}
					
		}
		for(int vm=1;vm<=dr-sr;vm++)
		{
			ArrayList<String>vpath=getpathjump(sr+vm,sc,dr,dc);
			for(String str:vpath)
			{
				path.add("v"+ vm + str);
			}
					
		}
		for(int dm=1;dm<=sc-dc && dm<=dr-sr;dm++)
		{
			ArrayList<String>dpath=getpathjump(sr+dm,sc+dm,dr,dc);
			for(String str:dpath)
			{
				path.add("d"+ dm + str);
			}
					
		}
		
		
		return path;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		ArrayList<String>fi=getpathjump(0,0,n-1,m-1);
		System.out.println(fi);

	}

}
