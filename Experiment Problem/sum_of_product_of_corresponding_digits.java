/*Write program, which reads two number (assume that both have same number of digits). 
 * The program outputs the sum of product of corresponding digits.
 *  Input 327 and 539 output 3x5+2x3+7x9=84. 
 */
public class sum_of_product_of_corresponding_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=327;
		
		
		int m=539;
		int sp=0;
		
		for(int j=0;j<n;j++)
		{
			
			for (int i=0;i<m;i++)
			{
				int rep=n%10;
				int res=m%10;
				
			    sp=sp+res*rep;
				n=n/10;
				m=m/10;
				
			}
			System.out.print(" SUM OF CORRESPONDING NUMBER OF DIGITS IS : "+sp);
		}
		
		
		
	}

}
