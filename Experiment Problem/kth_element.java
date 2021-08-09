//Write program to print the kth digit from last. e.g. input 23617 and k=4 output 3
import java.util.*;
public class kth_element {
	
	public static void number(int num, int k)
	{
		int div=(int) Math.pow(10,k-1);
		if(div>num) 
		{
			System.out.println(-1);
			
		}
		else
		{
			System.out.println("Kth element from the last is : "  +(num/div)%10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		System.out.print("Enter the number you want to enter : ");		
		int num=Sc.nextInt();
		System.out.println();
		System.out.print("Enter the kth element from the last you want to search : ");
		int k=Sc.nextInt();
		System.out.println();
		number(num,k);

	}

}
