import java.io.*;
import java.util.*;

public class string_compression {

	public static String compression1(String str){
		String s=str.charAt(0)+"";
		for(int i=1;i<str.length();i++)
		{
		    char cc=str.charAt(i);
		    char prev=str.charAt(i-1);
		    if(cc!=prev)
		    {
		        s=s+cc;
		        
		    }
		  
		}
		return s;
	}

	public static String compression2(String str){
	    		String s=str.charAt(0)+"";
	    		
		int count=1;
		
		for(int i=1;i<str.length();i++)
		{
		    char cc=str.charAt(i);
		    char prev=str.charAt(i-1);
		    if(cc==prev)
		    {
		        count++;
		    }
		    else{
		    if(count>1)
		    {
		        s=s+count;
		        count=1;
		    }
		    s=s+cc;
		    }
		}
		if(count>1)
		{
		   s=s+count;
		   count=1;
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}