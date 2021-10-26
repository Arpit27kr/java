package hello;

public class lab7 {
	
	public static String toupper(String var,int n )
	{
		String str="";
		String str2="";
		
		for(int i=0;i<=n-1;i++)
		{
			String ch=var.charAt(i)+"";
			str=str+ch.toUpperCase();
		}
		
		for(int i=n;i<var.length();i++)
		{
			String ch=var.charAt(i)+"";
			str2=str2+ch;
		}
		String s3=str+str2;

		
		return s3;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var="uppercase";
		
		
		String res=toupper( var,4);
		System.out.println(res);
	
		

	}

}