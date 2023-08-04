package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertUpdateDelete {
public static void main(String[] args) {
	Connection connection =null;
	//Load the driver class
	try {
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded!");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mysql");
		System.out.println("Connection established!");
		Statement  statement = connection.createStatement();
		System.out.println("Statement created");

//		int noOfRows = statement.executeUpdate("insert into user values (102,'abc@c.com','fname','lname')");
//		System.out.println(noOfRows + " inserted!");
		
//		int noOfRows = statement.executeUpdate("update user set email = 'newmail@nm.com'");
////		int noOfRows = statement.executeUpdate("update user set email = 'asf@nm.com' where id = 102");
//			System.out.println(noOfRows + " updated!");
		
//		int noOfRows = statement.executeUpdate("delete from user  where user_id = 102 ");
//		int noOfRows = statement.executeUpdate("delete from user");
//		System.out.println(noOfRows + " deleted!");
				
		
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
