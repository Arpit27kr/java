/*
  Java Program to replace the spaces of a string with a specific character
*/
import java.util.*;
public class remove_whitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String s="";
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<str.length();i++)
		{
			s+=sb;
			if(str.charAt(i)==' ')
			{
				sb.deleteCharAt(i);
			}
		}
		System.out.println(sb);
		
		

	}

}
