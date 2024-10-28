package org.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeJDBC {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Load the Driver
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. Establish the connection with Database
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		
		// 3. Write SQL Queries
		
		String sql="select * from employees";
		
		//4. Prepare SQL Document
		
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		
		// 5. Execute the Statement
		
		ResultSet executeQuery = prepareStatement.executeQuery();
		
		// 6. Iterate the Result
		
		while (executeQuery.next()) {
			
			String string = executeQuery.getString("First_name");
			
			String string2 = executeQuery.getString("salary");
			
			System.out.println("Name         :" + string + "       Salary     :" + string2);
			
		}
		
		// 7. Close the Connection
		
		connection.close();
			
	}

}
