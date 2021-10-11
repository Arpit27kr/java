package hello;
import java.util.*;

public class Fit_squares_in_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=input.nextInt();
			if(t>1000)
			{
				return;
			}
			else if(a>100||a<1)
			{
				return;
			}
			int b;
			int c=a/2;
			b=(c*(c-1))/2;
			System.out.println(b);
		}
		
		
		
		

	}

}
