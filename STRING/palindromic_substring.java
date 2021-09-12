//program to print all palindromic substrings 
import java.util.*;
public class palindromic_substring {
	public static boolean ispalindrome(String ss)
	{
		
		int i=0;
		int j=ss.length()-1;
		while(i<j)
		{
			if(ss.charAt(i)!=ss.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void substring(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String ss=str.substring(i,j);
				if(ispalindrome(ss)==true)
				{
					System.out.println(ss);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		String str=input.next();
		substring(str);
		

	}

}
