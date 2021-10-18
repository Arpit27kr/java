package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class maze_path {
	
	public static ArrayList<String> getpath(int sr,int sc ,int dc,int dr)
	{
		if(sr==dr&&sc==dc)
		{
			ArrayList<String>bres=new ArrayList<>();
			bres.add(" ");
			return bres;
		}
		ArrayList<String>hpath=new ArrayList<>();
		ArrayList<String>vpath=new ArrayList<>();
		
		if(sc<dc)
		{
			hpath=getpath(sr,sc+1,dr,dc);
		}
		if(sr<dr)
		{
			vpath=getpath(sr+1,sc,dr,dc);
		}
		
		ArrayList<String>paths=new ArrayList<>();
		
		for(String str:hpath)
		{
			paths.add("h"+str);
		}
		for(String str:vpath)
		{
			paths.add("v"+str);
		}
		
		return paths;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		ArrayList<String>fi=getpath(1,1,n,m);
		System.out.println(fi);
		

	}

}
