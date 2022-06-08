package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ToEstablishConnection {

	// third 2nd insert dynamically
	public void addDynamically(Employee employee) {

		String query = "insert into employee values(?,?)";
		String url = "jdbc:mysql://localhost:3306/base";
		String username = "root";
		String password = "root";
		String s = "com.mysql.cj.jdbc.Driver";

		try {// load and register the driver
			Class.forName(s);

			// establish connection
			Connection connection = DriverManager.getConnection(url, username, password);

			//create statement
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			//set values to ?s
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());

			//executing statement
			preparedStatement.execute();

			//close connection
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		System.err.println("data saves successfully");
		System.out.println("id  :" + employee.getId());
		System.out.println("name  :" + employee.getName());
	}

	public void getDynamically(String name) {

		String query = "select *  from employee where name=?";
		String url = "jdbc:mysql://localhost:3306/base";
		String username = "root";
		String password = "root";
		String s = "com.mysql.cj.jdbc.Driver";

		try {// load and register the driver
			Class.forName(s);

			// establish connection
			Connection connection = DriverManager.getConnection(url, username, password);

			// create statement
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			//set the values
			preparedStatement.setString(1, name);

			// executing the query and storing into resultset
			ResultSet resultSet = preparedStatement.executeQuery();

			
			//getting output by using the method in resultset called next() which give null when value is null
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));

			}

			//close connection
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
