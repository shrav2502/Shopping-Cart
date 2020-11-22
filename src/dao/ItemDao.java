package dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.Item;
import resource.DbConnection;


public class ItemDao {
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	Connection con;
	public List<Item> retrieveAllProduct(){
		List<Item> listofItem=new ArrayList<Item>();
		try {
			con=DbConnection.getDbConnection();
			pstmt=con.prepareStatement("select * from item");
			rs=pstmt.executeQuery();
			while(rs.next()) {
			Item ii=new Item();
			ii.setItemId(rs.getString(1));
			ii.setItemName(rs.getString(2));
			listofItem.add(ii);
			}
		    }catch(Exception e) {
		    	System.out.println("retriveAll Item"+e);
		}
		return listofItem;
		}
}
