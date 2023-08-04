package jdbc;

import java.sql.*;

public class JDBCSelectStatementPostgreSQL {
public static void main(String[] args) {
	Connection connection =null;
	//Load the driver class
	try {
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded!");
//		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mysql");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb1", "postgres", "postgresql");
		System.out.println("Connection established!");
		Statement  statement = connection.createStatement();
		System.out.println("Statement created");
//		ResultSet  resultSet = statement.executeQuery("select * from users order by user_id");
		ResultSet  resultSet = statement.executeQuery("select * from users ");
		System.out.println("Result set returned");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString("email"));
			System.out.println(resultSet.getString("first_name"));
			System.out.println(resultSet.getString(4));
			System.out.println("********");
		}
//		else
//		{
//			System.out.println("No data found!");
//		}
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not found!");
	} catch (SQLException e) {
		System.out.println("Exception related to SQL connection or query!");
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Unable to close connection!");
		}
	}

}
}
