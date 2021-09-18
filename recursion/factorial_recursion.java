import java.util.Scanner;

public class factorial_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int f=factorial(n);
		System.out.println(f);

	}
	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int fnc=factorial(n-1);
		int fc=n*fnc;
		return fc;
		
		
		
	}

}
