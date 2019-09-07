package servlet.com.aditya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import servlet.com.aditya.config.DBConnect;
import servlet.com.aditya.pojo.User;

public class UserDao {

	Connection connection = DBConnect.getConnect();

	public boolean addUser(User u) {

		//System.out.print("DVHJVFHJVD" + u);
		String sql = "insert into user values(?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			System.out.println(u.getName());
			ps.setString(1, u.getName());
			ps.setString(2, u.getNumber());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());

			int i = ps.executeUpdate();
			if (i > 0) {
				//System.out.println("Success");
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
