package com.shopping.dal;

import java.sql.*;
import java.util.ArrayList;

import com.shopping.model.Product;
import com.shopping.utils.ConnectionUtils;

public class ProductDao {

    private Connection con ;

    public ProductDao() {
        con = ConnectionUtils.getDbConnection();
       
        System.out.println("Connection = " + con);

        System.out.println("------ProductDao------");
    }

    // =====================================================
    // SELECT * FROM Product
    // =====================================================
    public ArrayList<Product> getAllPrds() {

        ArrayList<Product> prdList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM Product";

            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery(sql);

            while (rset.next()) {

                Product p = new Product(
                        rset.getInt("id"),
                        rset.getString("name"),
                        rset.getDouble("price"),
                        rset.getInt("qty"));

                prdList.add(p);
            }
          
            rset.close();
            stmt.close();
            return prdList;
          

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return prdList;
      
    }

    // =====================================================
    // INSERT
    // =====================================================
    public int addNewPrd(Product newPrd) {

        int rows = 0;

        try {

            String sql = "INSERT INTO Product VALUES (?, ?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, newPrd.getId());
            pstmt.setString(2, newPrd.getName());
            pstmt.setDouble(3, newPrd.getPrice());
            pstmt.setInt(4, newPrd.getQty());

            rows = pstmt.executeUpdate();

            pstmt.close();

            System.out.println("Product Inserted Successfully");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return rows;
    }

    // =====================================================
    // DELETE
    // =====================================================
    public int deletePrd(int id) {

        int rows = 0;

        try {

            String sql = "DELETE FROM Product WHERE id = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);

            rows = pstmt.executeUpdate();

            pstmt.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return rows;
    }

    // =====================================================
    // SEARCH BY ID
    // =====================================================
    public Product searchById(int id) {

        Product p = null;

        try {

            String sql = "SELECT * FROM Product WHERE id = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                p = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("qty"));
            }

            rs.close();
            pstmt.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return p;
    }

    // =====================================================
    // UPDATE
    // =====================================================
    public int updatePrd(Product p) {

        int rows = 0;

        try {

            String sql =
                    "UPDATE Product SET name=?, price=?, qty=? WHERE id=?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, p.getName());
            pstmt.setDouble(2, p.getPrice());
            pstmt.setInt(3, p.getQty());
            pstmt.setInt(4, p.getId());

            rows = pstmt.executeUpdate();

            pstmt.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return rows;
    }
}