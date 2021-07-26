/* print today date
import java.time.LocalDate;
public class date_and_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myObj= LocalDate.now();
		System.out.println(myObj);

	}

}
*/

//print date and time 

import java.time.LocalTime;
import java.time.LocalDate;
public class date_and_time{
	public static void main(String[] args)
	{
		LocalTime muobj=LocalTime.now();
		System.out.println(" today's time is : " +muobj);
		LocalDate myObj= LocalDate.now();
		System.out.println(" Today's date is : " +myObj);
	}
}


