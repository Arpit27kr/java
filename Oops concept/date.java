package revision;

public class date {
	int day ;
	int month;
	int year;
	
	public date(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}

	
public static void main(String[] args) 
{
		// TODO Auto-generated method stub
	date d1=new date(15,16,17);
	System.out.println(d1.day);
	System.out.println(d1.month);
	System.out.println(d1.year);
	
	
	
	

	}

}
