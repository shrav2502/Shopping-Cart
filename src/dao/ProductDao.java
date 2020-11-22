package dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.Product;
import resource.DbConnection;

public class ProductDao {
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	Connection con;
	public List<Product> retrieveAllProduct(){
		List<Product> listofProduct=new ArrayList<Product>();
		try {
			con=DbConnection.getDbConnection();
			pstmt=con.prepareStatement("select * from product");
			rs=pstmt.executeQuery();
			while(rs.next()) {
			Product pp=new Product();
			pp.setProductId(rs.getString(1));
			pp.setProductName(rs.getString(2));
			pp.setItemId(rs.getString(3));
			pp.setPrice(rs.getInt(4));
			}
		    }catch(Exception e) {
		    	System.out.println("retriveAll Product"+e);
		}
		return listofProduct;
		}
}
