package com.lekhraj.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:ng6";	
		String user = "sys as SYSDBA";		
		String pass = "sys";
		
		 user = "system";pass = "system";
		
		//jdbcUrl = "aws-rds-oracle-db-1.cvhmhffpz03y.us-east-2.rds.amazonaws.com:1521:ng6";		user="lekhrajdinkar" ; pass="June#1818" ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}



