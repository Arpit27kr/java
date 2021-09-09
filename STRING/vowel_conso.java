//Java Program to count the total number of vowels and consonants in a string

import java.util.*;
public class vowel_conso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				v++;
			}
			else {
				c++;
			}
		}
		System.out.println("number of vowels are " +v);
		System.out.println("Number of consonants are : " +c);
		
		
	}

}
