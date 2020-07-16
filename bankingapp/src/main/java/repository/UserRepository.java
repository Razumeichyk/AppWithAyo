package repository;

import model.User;

import java.sql.*;

public class UserRepository {

    private String dbUserName = "root";
    private String dbPassword = "090592f";
    private String dbURL = "jdbc:mysql://localhost:3306/banking_app";

    public User findUserById(int id) throws SQLException {

        User user = null;
        Connection conn = DriverManager.getConnection(dbURL, dbUserName, dbPassword);

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM user WHERE id = ?");
        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()){
            user = new User(
            rs.getInt("id"),
            rs.getString("password"),
            rs.getString("firstName"),
            rs.getString("lastName")
            );
        }

        return user;
    }
}
