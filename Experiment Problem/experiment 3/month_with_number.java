/*3.	Write a program to input a number of a month (1 - 12) and print its equivalent name of 
the month. ( e.g 1 to Jan, 2 to Feb. 12 to Dec.) 
*/
import java.util.*;
public class month_with_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.println("Enter the number (0-12) : ");
		int ch=input.nextInt();
		switch(ch) {
		case 1: 
			 System.out.println("JANUARY");
			 break;
	    case 2:
	    	 System.out.println("Febuary");
	    	 break;
	    case 3:
	    	 System.out.println("MARCH");
	    	 break;
	    case 4:
	    	 System.out.println("APRIL");
	    	 break;
		
	    case 5:
	    	 System.out.println("MAY");
	    	 break;
	    case 6:
	    	 System.out.println("JUNE");
	    	 break;
	    case 7:
	    	 System.out.println("JULY");
	    	 break;
	    case 8:
	    	 System.out.println("AUGUST");
	    	 break;
	    case 9:
	    	 System.out.println("SEPTEMBER");
	    	 break;
	    case 10:
	    	 System.out.println("OCTOBER");
	    	 break;
	    case 11:
	    	 System.out.println("NOVEMBER");
	    	 break;
	    case 12:
	    	 System.out.println("DECEMBER");
	    	 break;
	    default:
	    	System.out.println("WRONG INPUT");
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		

	}

}
