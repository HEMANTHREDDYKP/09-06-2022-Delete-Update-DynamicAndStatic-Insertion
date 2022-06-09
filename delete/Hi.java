package jdbc.sub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hi {

	public void deletingDataUsingId(int id) {
		String query = "delete from employee where id=?";
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
			preparedStatement.setInt(1, id);

			// executing statement
			preparedStatement.execute();

			// close connection
			connection.close();

		} catch (ClassNotFoundException | SQLException er) {
			er.printStackTrace();
		}

	}
}
