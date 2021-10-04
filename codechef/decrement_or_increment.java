package hello;
import java.util.*;

public class decrement_or_increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if(n%4==0)
		{
			System.out.println(n+1);
		}
		else {
			System.out.println(n-1);
		}

	}

}
