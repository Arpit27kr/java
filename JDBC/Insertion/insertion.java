//if we want to insert one record
package jdbc_insertion;
import java.util.*;
import java.sql.*;

import java.sql.DriverManager;

public class insertion {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","computerforfun");
		Statement st=con.createStatement();
		 int count=st.executeUpdate("insert into  students values (05,\"sharma\")");
		System.out.println(count);
		
		

	}

}
