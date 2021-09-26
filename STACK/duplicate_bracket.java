import java.util.*;
public class duplicate_bracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner input=new Scanner(System.in);
         String str=input.nextLine();
         Stack<Character>st=new Stack<>();
         for(int i=0;i<str.length();i++)
         {
             char ch=str.charAt(i);
             
             if(ch==')')
             {
            	if(st.peek()=='(')
            	{
            	  System.out.println("True");
            		return;
            	}
            	else {
            		while(st.peek() !='(' )
            		{
            			st.pop();
            		}
            		st.pop();
            	}
            	
             }
             else {
            	 
            	 
            	 
            	 st.push(ch);
             }
         


        		 
         }
		
		
		System.out.println("false");

	}

}
