package bookshop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static String username = "postgres";
	private static String password = "root";
	private static String url = "jdbc:postgresql://localhost:5432/varun";

	public static Connection getDBConnection() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/varun","postgres","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}



