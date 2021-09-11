import java.util.*;
public class sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements ----->");
		int num=input.nextInt();
		int [] a=new int[num];
		
		for(int i=0;i<num;i++)
		{
			a[i]=input.nextInt();
		}
		int sum=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array is " +sum);

	}

}
