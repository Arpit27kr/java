import java.util.Scanner;

public class factorial_of_large_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);

	}

}
