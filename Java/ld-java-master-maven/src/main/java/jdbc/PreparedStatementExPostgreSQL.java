package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExPostgreSQL {
public static void main(String[] args) {
	Connection connection =null;
	//Load the driver class
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded!");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb1", "postgres", "postgresql");
		System.out.println("Connection established!");
		PreparedStatement  statement = connection.prepareStatement("insert into users values (?,?,?,?)");
		System.out.println("Statement created");
		
//		statement.setInt(1,103);//1 specifies the first parameter in the query  
//		statement.setString(2,"a@b.com");  
//		statement.setString(3,"fn");
//		statement.setString(4,"ln");
//		int noOfRows = statement.executeUpdate();
//		System.out.println(noOfRows + " inserted!");
//		
//		statement.setInt(1,104);//1 specifies the first parameter in the query  
//		statement.setString(2,"1a@b.com");  
//		statement.setString(3,"1fn");
//		statement.setString(4,"1ln");
//		noOfRows = statement.executeUpdate();
//		System.out.println(noOfRows + " inserted!");
		
//		statement.setInt(1,105);//1 specifies the first parameter in the query
//		statement.setString(2,"1a@b.com");
//		statement.setString(3,"1fn");
//		statement.setString(4,new Scanner(System.in).nextLine());
//		int noOfRows = statement.executeUpdate();
//		System.out.println(noOfRows + " inserted!");


		for(int i = 0; i<100; i++){
			statement.setInt(1,i);//1 specifies the first parameter in the query
			statement.setString(2,"1a@b.com" + i);
			statement.setString(3,"ln"+i);
//			statement.setString(4,new Scanner(System.in).nextLine());
			statement.setString(4,"ln" +i);
			statement.executeUpdate();
		}
		//int noOfRows = statement.executeUpdate("update user set email = 'newmail@nm.com'");
//		int noOfRows = statement.executeUpdate("update user set email = 'asf@nm.com' where id = 102");
//			System.out.println(noOfRows + " updated!");
		
//		int noOfRows = statement.executeUpdate("delete from user  where id = 102 ");
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
