package servlet.com.aditya.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static Connection getConnect() {
		Connection con=null;

		try {
		
			Class.forName("org.postgresql.Driver");
			
			con=DriverManager.getConnection("postgres://kagezioqxmdmrd:15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39@ec2-54-235-114-242.compute-1.amazonaws.com:5432/dc1g3kn8qse9je","kagezioqxmdmrd","15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39");
		} catch (Exception e) {
			e.printStackTrace();


			// DATABASE_URL: postgres://kagezioqxmdmrd:15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39@ec2-54-235-114-242.compute-1.amazonaws.com:5432/dc1g3kn8qse9je
		}
		//System.out.println("Connecting to database ...");
		return con;
		
	}
}
