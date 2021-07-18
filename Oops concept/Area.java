import java.util.*;
public class Area {
	
	int peri;
	int side;
	  
	 int perimeter(int side)
	{
		
		peri=side*4;
		return peri;
		
	}
	
	 int getarea(int l, int b)
	 {
		return l * b;
	 }
	public static void main(String[] args)
	{
		int side;
		int l,b;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a side ");
		side =sc.nextInt();
	    Area p = new Area();
	    System.out.println("Perimeter of rectangle is " + p.perimeter(side));
	    System.out.print("Enter the leangth for area ");
	    l =sc.nextInt();
	    System.out.print("enter the value of breadth ");
	    b=sc.nextInt();
	    Area s=new Area();
	    System.out.print("Area of rectangle is " + s.getarea( l ,  b));
	    
	    
	    
		
		
	}
	

}
