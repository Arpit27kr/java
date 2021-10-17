package recursion;

import java.util.ArrayList;
import java.util.Scanner;



public class get_KPC {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		ArrayList<String>fi=getpc(str);
		System.out.println(fi);

	}

	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static ArrayList<String>getpc(String str)
	{
		if(str.length()==0)
		{
			ArrayList <String>bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String>rres=getpc(ros);
		
		ArrayList<String>mres=new ArrayList<>();
		
		String wordch=codes[ch-'0'];
		
		for(int i=0;i<wordch.length();i++)
		{
			char wordsmall=wordch.charAt(i);
			for(String rstr:rres)
			{
				mres.add(wordsmall+rstr);
				
			}
			
			
		}
		return mres;
	}

	
}
