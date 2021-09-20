import java.util.*;
public class array_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
	
		ArrayList<Integer>al=new ArrayList();
			for(int i=0;i<n;i++)
			{
				al.add(input.nextInt());
				
			}
			System.out.println(al);
			
			
			
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
				     if(al.get(i)==al.get(j))
				     {
				    	 int p=al.get(j);
				    	
				    	 
				    	 System.out.println(p);
				    	 	
				    	 
				    	 
				     }
				    	 
				    	 
			    }
			}
		
		
				
				
	
		
		
		
		
	}

	
}
