package jdbc_insertion;
import java.util.*;
import java.sql.*;
public class insert_many {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String query="insert into students values(?,?)";
		int uid=06;
		String uname="yadav";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","computerforfun");
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, uid);  // for 1st question mark in line 9 
		st.setString(2, uname);
		int count=st.executeUpdate();
		System.out.println(count);
		st.close();
		con.close();
		

	}

}
