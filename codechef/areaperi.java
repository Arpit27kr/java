package hello;
import java.util.*;
public class areaperi {
	public static int perimeter(int l,int b)
	{
		
	  	return 2*(l+b);
	}
	public static int area(int l,int b)
	{
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	
		System.out.println("enter length");
		int l=input.nextInt();
		System.out.println("enter breadth");
		int b=input.nextInt();
		int p=perimeter(l,b);
		int a=area(l,b);
		if(p>a)
		{
			System.out.println("peri" );
			System.out.println(p);
		}
		else if(a>p)
		{
			System.out.println("area");
			
		}
		else {
			System.out.println("Equal");
		}
	}

}
