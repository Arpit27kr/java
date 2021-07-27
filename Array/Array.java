
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]x= {10,20,30};
		System.out.println(x[0]);
		int y=x[1];
		System.out.println(1);
		System.out.println(x);
		
		System.out.println("****************STRING IN ARRAY*****************************************************************");
		
		String[]s= {"Arpit","Rupesh","Bansal"};
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s.length);
		System.out.println(s[0].length());	   // **leangth() method is final object available for string
		
		System.out.println("***************LENGTH VS LENGTH() METHOD******************************************************************");
		int[] z= new int [6];
	//	System.out.println(z.length()); this will show error because z is a variable so method(leangth()) cannot be assigned 
	    // leangth() method is final object available for string objects not for arrays
		System.out.println(z.length);// this will not give error
		System.out.println("*************2D ARRAY ********************************************************************");
		int [][]c=new int [12][3]; // initialize 2d array with length 12
		System.out.println(c.length);
		System.out.println(c[0].length);
		 
		
		
		
		
		
		
		
		
		;
		
		

	}

}
