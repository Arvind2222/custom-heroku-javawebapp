package servlet.com.aditya.config;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect {


private static Connection getConnect() throws URISyntaxException, SQLException {
   URI dbUri = new URI(System.getenv("DATABASE_URL"));
   String username = "kagezioqxmdmrd";
   String password = "15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39";
   String dbUrl = "jdbc:postgres://ec2-54-235-114-242.compute-1.amazonaws.com:5432/dc1g3kn8qse9je?sslmode=require&user=kagezioqxmdmrd&password=15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39";
   return DriverManager.getConnection(dbUrl, username, password);
}



	public static Connection getConnection_1() {
		Connection con=null;

		try {
		
			Class.forName("org.postgresql.Driver");
			
			con=DriverManager.getConnection("jdbc:postgres://ec2-54-235-114-242.compute-1.amazonaws.com:5432/dc1g3kn8qse9je?sslmode=require&user=kagezioqxmdmrd&password=15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39","kagezioqxmdmrd","15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39");
		} catch (Exception e) {
			e.printStackTrace();


			// DATABASE_URL: postgres://kagezioqxmdmrd:15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39@ec2-54-235-114-242.compute-1.amazonaws.com:5432/dc1g3kn8qse9je
		}
		//System.out.println("Connecting to database ...");
		return con;
		
	}
}
