//Java Program to determine whether two strings are the anagram
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		String str2=input.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length())
		{
			System.out.println("Strings are not anagram");
			
		}
		else {
			char[] String1=str1.toCharArray();
			char[] String2=str2.toCharArray();
			 Arrays.sort(String1);  
	            Arrays.sort(String2);
			System.out.println(String1);
			System.out.println(String2);
			if(Arrays.equals(String1,String2)==true)
			{
				System.out.println("STRINGS ARE ANAGRAM");
			}
			else {
				System.out.println("Strings are not anagram");
			}
		}
		

	}

}
