package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.MyPageDTO;
import com.internousdev.ecsite.util.DBConnector;

public class MyPageDAO {
	private DBConnector dbConnector = new DBConnector();
	
	private Connection connection = dbConnector.getConnection();
	
	/**
	 * 商品履歴取得
	 * 
	 * @param item_transaction_id
	 * @param user_master_id
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<MyPageDTO> getMyPageUserInfo(String 
	item_transaction_id, String user_master_id) throws SQLException {
		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		
	}
}