package servlet.com.aditya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import servlet.com.aditya.config.DBConnect;

public class LoginDao {

	String sql = "SELECT * FROM USER_POJO  where Name=? and Password=?";
	String url = "jdbc:postgresql://ec2-54-235-114-242.compute-1.amazonaws.com:5432/dc1g3kn8qse9je?sslmode=require&user=kagezioqxmdmrd&password=15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39";
	String username = "kagezioqxmdmrd";
	String password = "15bcf3cb86c38c1d9ea086abe50b7d5dfbec2d3f60379e4ea75468802549fe39";

	public boolean check(String uname, String pass) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DBConnect.getConnect();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, uname);
			statement.setString(2, pass);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}
