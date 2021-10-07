package hello;
import java.util.*;

public class two_vs_ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    if(n%10==0)
		    {
		        System.out.println("0");
		    }
		    else if(n%5==0 && n%10!=0)
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("-1");
		    }
		}
		
		
		
		

	}

}
