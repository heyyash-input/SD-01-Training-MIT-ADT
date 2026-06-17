package com.shopping.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils {
	
//	private static Connection con ;
//	
//	public static Connection getDBCon() {
//		try {
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mit" , "root" , "Yash@8930727#");
//			System.out.println("----Connected to DB----");
//			return con ;
//		}
//		catch(Exception ex ) {
//			ex.printStackTrace();
//		}
//		
//		return null ;
//	}
//	---------------------------------------------------------------------------------------------
		private static Connection con ;
		
		public static Connection getDbConnection() {
		    try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        System.out.println("----------Driver Loaded Successfully---------");

		        Connection con = DriverManager.getConnection(
		            "jdbc:mysql://localhost:3306/mit",
		            "root",
		            "Yash@8930727#");

		        System.out.println("-------Connected to DB--------");
		        return con;
		    }
		    catch (Exception ex) {
		    	 System.out.println(ex.getMessage());
		        ex.printStackTrace();
		    }
		    System.out.println("-------Not connected to DB -------");
		    return null;
		}
//-----------------------------------------------------------------------------------------------		
}