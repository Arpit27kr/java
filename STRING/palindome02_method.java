import java.io.*;
import java.util.*;

public class palindome02_method {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int k=0;
    
        int n=A.length();
      
        /* Enter your code here. Print output to STDOUT. */
      StringBuilder sb=new StringBuilder();
    		  {
    			  for(int i=0,j=A.length()-1;i<=j;i++,j--) {

    		            if(A.charAt(i)!=A.charAt(j)) 
    		            {
    		            	k++;
    		            }

    		            }
    				  
    				  
    				  
    			  
    			  
    			  if(k==0)
    			  {
    				  System.out.println("Yes");
    			  }
    			  else {
    				  System.out.println("No");
    			  }
    		  }
       
    }
}



