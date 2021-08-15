
public class duplicate_value_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]x= {1,2,5,2,1,4};
		int n=x.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(x[i]==x[j])
				{
					System.out.println("Element found with duplicate value is " +x[i]);				
				}
			}
		}
		
	}

}
