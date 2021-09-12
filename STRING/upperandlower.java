/*1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
*/

import java.util.*;
public class upperandlower 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		StringBuilder sb=new StringBuilder (str);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				
			{
				char uch= (char)('A'+ch-'a');
				sb.setCharAt(i, uch);
			}
			else if(ch>='A'&&ch<='Z')
			{
				char uch= (char)('a'+ch-'A');
				sb.setCharAt(i, uch);
				
			}
			sb.toString();
			
		} 
		System.out.println(sb);
		} 
}