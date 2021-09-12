import java.util.*;
public class palindomic_string {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner (System.in);
		String str=input.nextLine();
		int n=str.length();
		boolean flag=true;
		
		 for(int i = 0; i < str.length()/2; i++){    
	            if(str.charAt(i) != str.charAt(str.length()-i-1)){    
	                flag = false;    
	                break;    
	            }    
	        }    
		
		
		
		
		
		
		if(flag==false)
	    {
	    	System.out.println("not palindome ");
	    	
	    }
	    else {
	    	System.out.println("palindome");
	    	
	 }
	    
	   
	}
		
}


