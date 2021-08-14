
public class largest_sum_of_subarray_kadane_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {1,4,-5,5,-6,2,5,-1};
		int max_so_far=Integer.MIN_VALUE;
		int max_end=0;
		int start=0,end=0,s=0;
		for(int i=0;i<x.length;i++)
		{
			max_end=max_end+x[i];
			if(max_so_far<max_end)
			{
				max_so_far=max_end;
				start=s;
				end=i;
			}
			if(max_end<0)
			{
				max_end=0;
				s=i+1;
			}
			
		}
		System.out.println(max_so_far);
		System.out.println("Start index is " +start+ " end index is " +end);
		

	}

}
