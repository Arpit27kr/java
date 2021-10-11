package hello;
import java.util.*;

public class Valid_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int c=input.nextInt();
		    int sum=0;
		    sum=a+b+c;
		    if(sum==180)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    
		    
		    
		    
		    
		    
		}

	}

}
