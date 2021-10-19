package recursion;

import java.util.Scanner;



public class print_kpc {
	
	static String [] word= {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public static void kpc(String ques,String ans)
	{
		
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		String ros=ques.substring(1);
		
		String wordinch=word[ch-'0'];
		for(int i=0;i<wordinch.length();i++)
		{
			char option=wordinch.charAt(i);
			kpc(ros,ans+option);
		}
	
	}
	
	public static void main(String [] args)
	
	{
		Scanner input=new Scanner (System.in);
		String str=input.next();
		kpc(str,"");
		
		
		
	}

}
