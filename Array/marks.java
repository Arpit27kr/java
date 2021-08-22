import java.util.*;
public class marks {
	public static void asc(int a[])
	{
		System.out.println();
		 System.out.print("marks in ascending array is ");
		 for(int i=0;i<a.length-1;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp;
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
					 
				 }
				 
				 
			 }
			 
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+ " , " );
		 }
		 System.out.println();
		 for(int i=0;i<a.length;i++) {
			 if(a[i]>=40 && a[i]<=50)
			 {
				 System.out.println("Marks for " +(i+1)+ " student are " +a[i]+"      pass");
			 }
			 else if(a[i]>=51 && a[i]<=75)
			 {
				 
				 System.out.println("Marks for " +(i+1)+ " student are " +a[i]+"    merit  ");
			 }
			 else if(a[i]>75)
			 {
				 System.out.println("Marks for " +(i+1)+ " student are " +a[i]+ "   Distinction");
			 }
		 }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=input.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks of students " );
			a[i]=input.nextInt();
			
			
		}
		 asc(a);
		
				
		}

	}


