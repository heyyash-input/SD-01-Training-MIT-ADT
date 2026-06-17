package com.shopping.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shopping.model.Customer;
import com.shopping.utils.ConnectionUtils;

public class CustomerDao {
	
	public CustomerDao() {
		  con = ConnectionUtils.getDbConnection();
	       
	        System.out.println("Connection = " + con);
	        System.out.println("----CustomerDao Construtor called----");
	}
	private static Connection con ; 
	
	
	public Customer login(String email , String pwd) {
		
		try {
			String sql= "Select * from customer where email=? and pwd=?";
			  PreparedStatement pstmt = con.prepareStatement(sql);

		        pstmt.setString(1, email);
		        pstmt.setString(2, pwd);

		        ResultSet rset = pstmt.executeQuery();

		        if (rset.next()) {

		            Customer cust = new Customer();

		            cust.setId(rset.getInt("id"));
		            cust.setName(rset.getString("name"));
		            cust.setEmail(rset.getString("email"));
		            cust.setPass(rset.getString("pass"));

		            return cust;
		        }

		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }

		    return null; 
		}
	
	
	}
