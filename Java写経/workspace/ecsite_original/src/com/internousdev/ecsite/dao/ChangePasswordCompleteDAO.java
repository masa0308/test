package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordCompleteDAO extends ActionSupport implements SessionAware{

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public Map<String, Object> session;

	private String sql1 = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";

	public boolean getUserInfo(String loginUserId, String loginPassword) {

		boolean result = false;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){

				result = true;
			}

		}catch(Exception e){
			e.printStackTrace();
		}

		return result;
	}

	private String sql2 = "UPDATE login_user_transaction  SET login_pass = ?, updated_date = ? where login_id= ? AND login_pass = ?";

	public void changeUser(String loginUserId, String loginPassword, String changePassword) throws SQLException{

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.setString(1, changePassword);
			preparedStatement.setString(2, dateUtil.getDate());
			preparedStatement.setString(3, loginUserId);
			preparedStatement.setString(4, loginPassword);

			preparedStatement.execute();

		}catch(SQLException e){
			e.printStackTrace();

		}finally {
			connection.close();
		}


	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}
}
