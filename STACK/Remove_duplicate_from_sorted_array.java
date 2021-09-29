import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Remove_duplicate_from_sorted_array {
	
	 public static void removeDuplicates(int[] nums)
	 {
		 Stack<Integer>st=new Stack<>();
		 st.push(nums[0]);
		
		 for(int i=1;i<nums.length;i++)
		 {		
		st.push(nums[i]);
		 if(st.size()!=0 && st.peek()==nums[i-1])
		 {
			 	st.pop(); 	 	
			 
		 }
		
		
		 }
		 System.out.println(st); 
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int []nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=input.nextInt(); 
		}
		Arrays.sort(nums);
		
		removeDuplicates(nums);


		
	}
	

}
