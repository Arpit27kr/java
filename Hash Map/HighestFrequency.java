package Hashmap;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
	
		
		HashMap<Character, Integer> hp=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			char s=str.charAt(i);
			
			if(hp.containsKey(s))
			{
				int oldf=hp.get(s);
				int newf=oldf+1;
				hp.put(s, newf);
			}
			else
			{
				hp.put(s, 1);
			}
			
			
		}
		
		char mfc=str.charAt(0);
		
		
		for(Character key:hp.keySet())
		{
			if(hp.get(key)>hp.get(mfc))
			{
				
				mfc=key;
				
			}
			
			
		}
		

		System.out.println(" "+mfc);
	}

}
