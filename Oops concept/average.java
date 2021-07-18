import java.util.*;
public class average 
{ 
	int avg(int n1,int n2, int n3) 
	
	{
	 
		return (n1*n2*n3)/3;
        
	}
		
}

class show
{
	public void main(String[] args)
	{
		int n1,n2,n3;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number 1 to be inserted ");
		n1=sc.nextInt();
		System.out.print("Enter the number 2 to be inserted ");
		n2=sc.nextInt();
		System.out.print("Enter the number 3 to be inserted ");
		n3=sc.nextInt();
		average a=new average();
		System.out.print(a.avg(n1 , n2,n3));
		
		
		
		
	}
}
 