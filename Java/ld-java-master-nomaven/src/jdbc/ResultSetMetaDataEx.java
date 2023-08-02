package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataEx {
public static void main(String[] args) {
	Connection connection =null;
	//Load the driver class
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded!");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mysql");
		System.out.println("Connection established!");
		Statement  statement = connection.createStatement();
		System.out.println("Statement created");
		ResultSet  resultSet = statement.executeQuery("select * from user");
		System.out.println("Result set returned");
		
		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
		System.out.println(resultSetMetaData.getColumnCount());
		System.out.println(resultSetMetaData.getColumnName(3));
		System.out.println(resultSetMetaData.getColumnTypeName(3));
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
