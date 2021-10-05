package hello;
import java.util.*;
public class chef_and_twoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str=input.next();  
		String str2=input.next();
		int min=0;
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			char ch2=str2.charAt(i);
			 if(ch1=='?' || ch2=='?')
			{	
				max++;
				min++;
				System.out.println("min in 1 --->" +min);
				 System.out.println("max in 1 --->" +max);
			
			}
			 else if(ch1==ch2)
				{
				
					min++;
					 System.out.println("min in 2 --->" +min);
					 System.out.println("max in 2 --->" +max);
					
				}
			 else if(ch1!=ch2)
			{ 
		
				max++;
				 System.out.println("min in 3 --->" +min);
				 System.out.println("max in 3 --->" +max);
				
			}
		}
		System.out.println("Minimum difference is -->"+(str.length()-min));
		System.out.println( "Maximum difference is ----> " +max);


	}

}
