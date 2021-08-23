/*4.	Write a program to find the sum of all integers greater than 40 
 * and less than 250 that are divisible by 5.
 */
public class Sum_of_integer_ranged_divide_by_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<1000;i++)
		{
			if(i>40 && i<250 &&i%5==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}
	

}
