import java.util.*;
  
  public class prime {
  
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int t=input.nextInt();
      
      
      for(int i=0;i<t;i++)
      {
    	  int n=input.nextInt();
    	  int count=0;
          for(int div=1;div<=n;div++)
          {
              if(n%div==0)
              {
                  count++;
              }
              
          }
          if(count==2)
          {
              System.out.println("Prime");
          }
          else
          {
               System.out.println("NOT Prime");
          }
      }
      
       
  
   }
  }