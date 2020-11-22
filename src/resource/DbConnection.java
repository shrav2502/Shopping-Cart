package resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con;
	public static Connection getDbConnection() {
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "shravanthi", "1234");
		} catch (Exception e) {
					System.out.println("Error in Db Connection "+e);
		}
		return con;
		}
		
		
		
		void closeResource() {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
