
public class String_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcde";
		String str2="deabc";
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the strings are non rotable");
			
		}
		
		
		else {
		str1=str1.concat(str2);
		
				
				
			if(str1.indexOf(str2) != -1)     // //Check whether str2 is present in str1 
		{
				System.out.println("Second string is a rotation of first string");    
				
	            
		}	
				else    {
	                System.out.println("Second string is not a rotation of first string");    
	            }
			
		}
		
		
		
		
		
		

	}

}
