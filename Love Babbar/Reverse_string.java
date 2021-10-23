package love_babbar;
import java.util.*;
public class Reverse_string {
	
	 public static  char [] reverseString(char[] s) {
	        
	        int start =0;
	     int last=s.length-1;
	        while(start<last)
	        {
	            char temp=s[start];
	            s[start]=s[last];
	            s[last]=temp;
	               start++;
	        last--;
	        }
	        return s;
	     
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

			char[] s = input.next().toCharArray();
		char[] p=	reverseString(s);
		System.out.println(p);
		

	}

}
