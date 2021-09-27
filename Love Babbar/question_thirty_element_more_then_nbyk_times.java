
public class question_thirty_element_more_then_nbyk_times {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	int k=4;
	int hf=8/4;
	int a[]= {3, 1, 2, 2, 1, 2, 3, 3};
	int count=1;
	for(int i=0;i<8;i++)
	{
	    int j=i+1;
	    while(j<a.length)
	    {
	    	if(a[j]==a[i])
	    	{	
	    	  count++;
	    	 
	    	  if(count>hf)
	    	  {
	    		  System.out.println("Number "+a[j]+" appears more the N/K Times by " +count );
	    	  }
	    	  
	    	  j++;
	    	}
	    	else {
	    		j++;
	    		
	    	}
	    	
	    }
	    count=1;
	  
		
	}
	
	
	

}
}
