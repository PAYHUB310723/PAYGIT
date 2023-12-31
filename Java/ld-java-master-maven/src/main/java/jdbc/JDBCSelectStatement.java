package jdbc;

import java.sql.*;

public class JDBCSelectStatement {
public static void main(String[] args) {
	Connection connection =null;
	//Load the driver class
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded!");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mysql");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "postgresql");
		System.out.println("Connection established!");
		Statement  statement = connection.createStatement();
		System.out.println("Statement created");
		ResultSet  resultSet = statement.executeQuery("select * from users order by user_id");
		System.out.println("Result set returned");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString("email"));
			System.out.println(resultSet.getString("last_name"));
			System.out.println("********");
		}
//		else
//		{
//			System.out.println("No data found!");
//		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}
