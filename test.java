import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
        int a=input.nextInt();
        int b=input.nextInt();
        int sum1=0;
      
        for(int i=0;i<=b;i++)
        {
        	  int n1=a/10;
        	  int n3=a%10;
              int n2=b/10;
              int n4=b%10;
              int n5=n1+n3;
              int n6=n2+n4;
               for(int j=n1;j<n3;j++)
               {
            	   for(int k=n2;k<=n4;k++)
            	   {
            		   sum1=j+k;
            	   }
            	   System.out.print(sum1);
               }
        	
        	
        	}
        System.out.println(sum1);
        
        }

	}


