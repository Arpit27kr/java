/*

Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.




*/
import java.io.*;
import java.util.*;

public class java_string_introduction {
    
    public static void sumlength(String A,String B)
           {
               int ch1=A.length();
               int ch2=B.length();
               System.out.println(ch1+ch2);
           }
           
           
    public static void compare(String A,String B)
    {
        int compare=A.compareTo(B);
        if(compare<0)
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
    }
    
    public static void add(String A,String B )
    {
    	String ab=A.substring(0,1).toUpperCase();
    	String bc=B.substring(0,1).toUpperCase();
    	String cd=A.substring(1);
    	String da=B.substring(1);
    	System.out.println(ab+cd+""+bc+da);
    }
    
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sumlength(A,B);
        compare(A,B);
        add(A,B);
        
    }
}



