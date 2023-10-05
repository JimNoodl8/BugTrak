package SQL;
import java.sql.*;

public class Queries{
	
		public static Connection Connect() {
			Connection conn = null;
			
			
			try {
				//install sqlite-jdbc jar file and add to Project > Properties > Java build path > libraries > add external jars
				Class.forName("org.sqlite.JDBC");
				
				//append absolute path of database file after jdbc:sqlite:
				conn = DriverManager.getConnection("jdbc:sqlite:D:\\Github\\BugTrak\\BugTrak\\bugtrak.db");
				System.out.print("DB connected");
				
			} catch (ClassNotFoundException | SQLException e) {			
				e.printStackTrace();
			}
			
			return conn;
		}
		
}