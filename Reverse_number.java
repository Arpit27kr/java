//Reverse a number
import java.util.*;
public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number ");
		int num=sc.nextInt();
		
		int rev=0;
		int rem;
		while(num!=0)
		{
			rem= num % 10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		
		System.out.println("Reversed number is " +rev);

	}

}
