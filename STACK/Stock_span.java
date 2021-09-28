import java.io.*;
import java.util.*;

public class Stock_span{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
     int [] span=new int [arr.length];
     Stack<Integer> st = new Stack<>();
   System.out.println("Entering 0 element in stack");
   st.push(0);
   span[0]=1;
   for(int i=1;i<arr.length;i++)
   {
	   System.out.println(st.peek());
       while(st.size()>00&&arr[i]>arr[st.peek()])
       {
    	   st.peek();
    	   System.out.println("peek element is "+arr[i-1] );
    	   System.out.println("element in array is ---->"+arr[i]);
    	   st.pop();
            System.out.println("Element poped is -->" +arr[i-1]);

           
       }      
       if(st.size()==0)
       {
    	  
           span[i]=i+1;
           System.out.println("value of span is "  +span[i]+ " for element " +arr[i]);
       }
       else{
    	   System.out.println("value of i is " +i);
           span[i]=i-st.peek();
           System.out.println("value of peek is " +arr[i]);
           System.out.println("value of span[i] in else part  is "  +span[i]);
       }
       st.push(i);
       System.out.println("Element added in stack is ----->" +arr[i]);
            
       
   }

   
   return span;
 }

}