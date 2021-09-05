/*

1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


*/
import java.util.*;
import java.io.*;
public class subsequence {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		ArrayList<String>res=gss(str);
		System.out.println(res);	
		
	}
	 public static ArrayList<String> gss(String str) {
		 
		 if(str.length()==0)
		 {
			 ArrayList<String>bres=new ArrayList<>();
			 bres.add("");
			 return bres;
		 }
		 
		 
		 char ch=str.charAt(0);       //a
		 String ros=str.substring(1);    //bc		 
		 ArrayList<String>rros=gss(ros); //recursion of rest of string
		 ArrayList<String>mres=new ArrayList<>();
		 for(String val:rros)
		 {
			 mres.add(" "+val);
			 
			 
		 }
		 
		 for(String val:rros) {
			 mres.add(ch +val );
			 
		 }
		 return mres;
		 
		 
		 
		 
		 
	 }

}
