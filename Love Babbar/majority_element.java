
public class majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,5,1,1,4};
		int hf=5/2;
		int i=0;
		int count =0;
		while(i<5)
		{
			int j=i+1;
			int num=a[i];
			while(j<5)
			{
				if(a[i]==a[j])
				{
					count++;
					if(count>hf)
					   {
						   System.out.println("majority element is ---> "+a[i]+ " count is --->" +count);
					   }
					j++;
				   
				}
				else {
					j++;
				}
	
			}
			i++;
			
			
		}
		
		
		

	}

}
