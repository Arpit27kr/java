/*Write program, which will find sum of product to consecutive digits.
 *  e.g. when the input is 23145 the output is 2x3 + 3x1 + 1x4 + 4x5 = 33.
 */
import java.util.*;
public class Sum_of_product {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("    ENTER THE NUMBER FOR SUM OF PRODUCT       ");
		
		int n=input.nextInt();
		int result=0;
		for(int i=0;i<n;i++)
		{
			 result+=(n%10)*((n%100)/10);
			n=n/10;
		}
		System.out.println(" SUM OF PRODUCT IS :  "+result);
		
		
		
		
		
		

	}

}
