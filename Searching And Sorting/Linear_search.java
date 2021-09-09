// linear search ------> search the index of element found
import java.util.*;
public class Linear_search {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n=input.nextInt();
			System.out.println("Enter the element to search");
			int k=input.nextInt();
			System.out.println("Enter the array");
			int [] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=input.nextInt();
			}
			for(int i=0;i<n;i++)
			{
			  if(arr[i]==k)
			  {
				  System.out.println(i+1);
				  break;
				  
			  }
			  else {
				  System.out.println("Element not found");
				  break;
			  }
			  
			}
		

	}

}
