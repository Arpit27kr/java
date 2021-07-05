import java.util.*;
public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	System.out.print("eneter the number of day ");
	int day=sc.nextInt();
	switch(day) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	default:
		System.out.println("not found");
	 }
	
  }
}
