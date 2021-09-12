/*
  Java Program to replace the spaces of a string with a specific character
*/
import java.util.*;
public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String s="";
		/*
		char ss='-';
		
			
		 str=str.replace(' ', ss);
		System.out.println(str);
		
		*/
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ') {
			s=s+str.charAt(i);
			}
			else if(str.charAt(i)==' ')
			{
				s=s+'-';
				
				
			}
			
		}
		System.out.println(s);
		
		

	}

}
