import java.io.*;
import java.util.*;

public class java_string_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();   // it will remove white spaces from the string
        // Write your code here.
      if(s.length()>0) {
        String [] str=s.split("[!,?._'@\\s]+");  //it will split string on base of  !,?._'@\\s
       System.out.println(str.length);
       for(String i : str)
       {
    	   System.out.println(i);
       }  
      }
      else {
    	  System.out.println(s.charAt(0));
      }
        scan.close();
    }
}

