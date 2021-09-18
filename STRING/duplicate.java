import java.util.Scanner;

public class duplicate {
	
	public static void find(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			 
				if(arr[i]==arr[j])
				{
					System.out.print("Elements with double value are "+arr[i]);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS");
		int n=input.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the number you want to insert");
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		find(arr,n);
		

		
		
	}

}
