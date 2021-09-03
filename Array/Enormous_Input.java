import java.util.*;

// Remember that the class name should be "Main" and should be "public".
public class Enormous_Input {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int count=0;
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
		   
		  a[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
		   
		 System.out.println(a[i]);
		 if(a[i]%3==0)
		 {
			 count++;
		 }
		}
		System.out.println(count);
		 
		
	
	}
}