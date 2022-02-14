package JDBC;
import java.sql.*;
import java.util.*;
public class jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","computerforfun");
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select* from students");
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			con.close();  
		st.close();
	}
}
