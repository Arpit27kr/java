import java.util.*;
public class even_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int n=input.nextInt();
		int [] a=new int [n];
		System.out.print ("Enter the elements  of array");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println("elements present at even position of array are -------->");
				System.out.println("Element " +a[i]+ " is present at  " +i+ " index " );
			}
			else 
			{
				System.out.println("elements present at odd position of array are -------->");
				System.out.println("Element " +a[i]+ " is present at  " +i+ " index " );
			}
		}
	}

}
