package jdbc_insertion;

public class records {
	

	private static int usid;
	private static String usname;	
	
	
	public records(int usid, String usname) {
		// TODO Auto-generated constructor stub
		this.usid=usid;
		this.usname=usname;
		
	}

	public static int getusid() {
		// TODO Auto-generated method stub
		return usid;
	}
	public static String getusname() {
		// TODO Auto-generated method stub
		return usname;
	}
	
	
	
	
	 
	

}
