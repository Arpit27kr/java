import java.util.Scanner;

public class tst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
        int a=input.nextInt();
        int b=input.nextInt();
        int sum1=0;
        int n1=a/10;
        int n2=b/10;
        int n3=a%10;
    	int n4=b%10;
    	int sum2=0;
        for(int i=n1;i<=n2;i++)
        {
        	
        	for(int j=n3;j<=n4;j++)
        	{
        		sum1=i+j;
        		
        		sum2=sum1+sum2;
        	}
        	System.out.print(sum2);
        	
        }
	}

}
