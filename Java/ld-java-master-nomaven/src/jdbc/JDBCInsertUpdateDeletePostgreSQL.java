package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertUpdateDeletePostgreSQL {
public static void main(String[] args) {
//	int i = 10;
//	int result = i/0;
	Connection connection =null;
	//Load the driver class
	try {
//		Class.forName("com.mysql.jdbc.Driver");
//		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded!");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb1", "postgres", "postgresql");
		System.out.println("Connection established!");
		Statement  statement = connection.createStatement();
		System.out.println("Statement created");

//		int noOfRows = statement.executeUpdate("insert into users values (102,'abc@c.com','fname','lname')");
//		System.out.println(noOfRows + " inserted!");
		
//		int noOfRows = statement.executeUpdate("update user set email = 'newmail@nm.com'");
//    	int noOfRows = statement.executeUpdate("update users set email = 'NEW@new.com' where user_id = 102");
//			System.out.println(noOfRows + " updated!");
		
		int noOfRows = statement.executeUpdate("delete from users  where user_id = 102 ");
//		int noOfRows = statement.executeUpdate("delete from user");
		System.out.println(noOfRows + " deleted!");
				
		
	}
//	catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	catch (SQLException e) {
		System.out.println("Not able to establish connection!");
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Unable to close the connection");
		}
		System.out.println("Connection closed successfully!");
	}

}
}
