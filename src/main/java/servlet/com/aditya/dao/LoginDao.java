package servlet.com.aditya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.aditya.config.DBConnect;

public class LoginDao {

	String sql = "SELECT * FROM USER  where UserName=? and Password=?";
	String url = "jdbc:mysql://localhost:3306/user";
	String username = "root";
	String password = "root";

	public boolean check(String uname, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
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
