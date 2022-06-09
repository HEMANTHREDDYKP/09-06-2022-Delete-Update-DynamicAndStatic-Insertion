package jdbc.sub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hi {

	public void UpdatingNameUsingId(int id,String name) {
		String query = "update u set name=? where id=?";
		String url = "jdbc:mysql://localhost:3306/me";
		String username = "root";
		String password = "root";
		String s = "com.mysql.cj.jdbc.Driver";

		try {// load and register the driver
			Class.forName(s);

			// establish connection
			Connection connection = DriverManager.getConnection(url, username, password);

			// create statement
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			// set values to ?s
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			

			// executing statement
			preparedStatement.execute();

			// close connection
			connection.close();

		} catch (ClassNotFoundException | SQLException er) {
			er.printStackTrace();
		}

	}
}
