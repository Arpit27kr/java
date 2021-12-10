package EXCEPTION;

class arpit extends Exception
{
	
	public arpit() {
		// TODO Auto-generated constructor stub
		System.out.println("This is arpit exception");
	}
}

public class custom {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		
		
		int i=5;
		int j=0;
		int k=0;
		try {
			
			k=i/j;
			System.out.println();
			throw new arpit();
			
		
		}
		catch(Exception e){
			System.out.println(k);
			
			
			System.out.println("Error found");
			
		}
		
		

	}

}
