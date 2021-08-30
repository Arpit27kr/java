import java.util.*;
public class DECREASING {
	public static void decreasingm(int n)
	{
		if(n>0) {
		System.out.println(n);
		
		decreasingm(n-1);
	}
  }
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		decreasingm(n);
		
	}

}
