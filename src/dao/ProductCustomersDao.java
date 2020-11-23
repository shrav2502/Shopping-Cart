package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import bean.ProductCustomers;
import resource.DbConnection;

public class ProductCustomersDao {
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	Connection con;
	
	public void addProduct(ProductCustomers pc){
		try {
			con=DbConnection.getDbConnection();
			pstmt=con.prepareStatement("insert into productcustomers values(?,?,?,?,?)");
			pstmt.setString(1,pc.getProductId());
			pstmt.setString(2, pc.getCustomerId());
			pstmt.setInt(3,pc.getDebitCardNumber());
			pstmt.setInt(4, pc.getCreditCardNumber());
			pstmt.setDouble(5, pc.getPrice());
		}catch(Exception e) {
			System.out.println("Add Product"+e);
		}
	}
	
	public void deleteProduct(String pid) {
		try {
			con=DbConnection.getDbConnection();
			pstmt=con.prepareStatement("delete from productcustomers where product_id=?");
			pstmt.setString(1, pid);
		    pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("Delete Product"+e);
		}
	}
	
	public void deleteAllProducts(String iid) {
		try {
			con=DbConnection.getDbConnection();
			pstmt=con.prepareStatement("delete * from productcustomers where customer_id=?");
			pstmt.setString(1, iid);
		    pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("Delete Product"+e);
		}
	}
}
