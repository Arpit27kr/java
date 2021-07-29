import java.util.*;

//Check if a key is present in every segment of size k in an array
public class check_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of element you want to enter");
		n=input.nextInt();
		System.out.println();
		System.out.print("Enter the elements here");
		
		
		int [] x=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=input.nextInt();
		}
		
		System.out.println();
		System.out.print("entered array is " );
		for(int i=0;i<n;i++)
		{
			System.out.print(x[i]+ " ");
		}
System.out.println();
		
		int no;
		
		
		System.out.print("Enter the number you want to search");
		no=input.nextInt();
		for(int i=0;i<n;i++)
		{
			if(x[i]==no);
			{
				System.out.println();
				System.out.print("Element found");
			}
			
			input.close();
			
			
			
		}
		
		
		

	}

}
