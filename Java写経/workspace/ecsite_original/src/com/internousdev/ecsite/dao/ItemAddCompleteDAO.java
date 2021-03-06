package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemAddCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateutil = new DateUtil();

	private int res;

	private String sql = "INSERT INTO item_info_transaction (item_name, item_price, item_stock, insert_date) VALUES(?, ?, ?, ?)";

	public int registerItem(String itemname, String itemprice, String itemstock ) throws SQLException{

		try{
			int itempriceInt = Integer.parseInt(itemprice);
			int itemstockInt = Integer.parseInt(itemstock);

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemname);
			preparedStatement.setInt(2, itempriceInt);
			preparedStatement.setInt(3, itemstockInt);
			preparedStatement.setString(4, dateutil.getDate());

			 res = preparedStatement.executeUpdate();


		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			connection.close();
		}

		return res;

	}


}
