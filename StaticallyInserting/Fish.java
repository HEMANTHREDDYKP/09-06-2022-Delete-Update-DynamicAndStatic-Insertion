package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Fish {
                      // first to insert statically
	public static void main(String[] args) {
    String query="insert into employee values(100,'me one')";
	String	url="jdbc:mysql://localhost:3306/base";
	String username="root";
	String password="root";
	String s="com.mysql.cj.jdbc.Driver";
		
		                
		try {//load and register the driver
			Class.forName(s);
			
			//establish connection
			Connection connection =DriverManager.getConnection(url,username,password);
			
			//create statement
			Statement statement=connection.createStatement();
			
			// execute statement
			statement.execute(query);
			
			
			//closeconnection
			connection.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
