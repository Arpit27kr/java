//Find the occurrence of an integer in the array
import java.util.*;
public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n;
		System.out.print("ENTER NUMBER OF ELEMENTS YOU WANT TO ENTER");
		System.out.println();
		n=input.nextInt();
		System.out.println();
		int[] a=new int[n];
		System.out.print("ENTER THE ELEMENTS YOU WANT TO ENTER");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int num;
		System.out.println();
		System.out.print("Enter number you want to see occurence");
		num=input.nextInt();
		System.out.println();
		System.out.print("OCCURENCE OF NUMBER IS : ");
		int count=0;
		for(int i=0;i<n;i++)
		{
			
			if(num==a[i])
			{
				count=count+1;
			}
			
		}
		
		System.out.println();
		System.out.print(+count);
		
		

	}

}
