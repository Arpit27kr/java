//Java Program to print the number of elements present in an array\
import java.util.*;
public class NUMBER_OF_ELEMENTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int [] a=new int[num];
		System.out.println("Enter the number of elements ----->");
		for(int i=0;i<num;i++)
		{
			a[i]=input.nextInt();
		}
		int count=0;
		for(int i=0;i<num;i++)
		{
			count++;
			
		}
		
		System.out.println("Number of elements are --------->" +(count));
		
		
		

	}

}
