package com.shopping.utils;

import java.sql.Connection;

public class TestDB {
	
	    public static void main(String[] args) {
	        Connection con = ConnectionUtils.getDbConnection();
	        System.out.println(con);
	    }
	
}
