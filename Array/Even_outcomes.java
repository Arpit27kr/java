
public class Even_outcomes  {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int a[]= {5,6,2,1,2};
		
		for(int i=0;i<5;i++)
		
		{	
		  {
			for (int j=0;j<5;j++)
			{
				if(j!=i) 
				{
					
				for(int k=0;k<5;k++)
					
				if( k!=i && k!=j )
					
				{
					for(int l=0;l<5;l++)
					{
						if(l!=k &&l!=j && l!=i)
							
						{
							for(int m=0;m<5;m++)
							{
								if(m!=l&&m!=k &&m!=j && m!=i &&a[m]%2==0)
							
					
				{
					System.out.println(a[i]+","+a[j]+","+a[k]+","+a[l]+","+a[m]);
				}
				}
			    }
				}
			}
				}
			}
		}

	 }
	}
}
