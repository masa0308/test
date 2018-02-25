package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ChangePasswordCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql1 = "UPDATE login_user_transaction  SET login_pass = ?, updated_date = ? where login_id= ? AND login_pass = ?";

	public void changeUser(String loginUserId, String loginPassword, String changePassword) throws SQLException{

		try {
			PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
			preparedStatement1.setString(1, changePassword);
			preparedStatement1.setString(2, dateUtil.getDate());
			preparedStatement1.setString(3, loginUserId);
			preparedStatement1.setString(4, loginPassword);

			preparedStatement1.execute();

		}catch(SQLException e){
			e.printStackTrace();

		}finally {
			connection.close();
		}


	}

}
