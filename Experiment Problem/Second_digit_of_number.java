import java.util.Scanner;
//Write program to print the second digit. e.g. input 23516 the output is 3
public class Second_digit_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		   System.out.print("Enter the number for first number calculation : ");
			int n=input.nextInt();
			while(n>=100)
			{
				n=n/10;
				
				
			}
			
			
			
			System.out.println();
			
			int n2=n%10;
			System.out.print("Second number is : " +n2);

	}

}
