package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.ItemDeleteCompleteDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemDeleteCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private ItemDeleteCompleteDTO itemDeleteCompleteDTO = new ItemDeleteCompleteDTO();

	private String sql1 = "SELECT * FROM item_info_transaction where id = ? AND item_name = ?";

	public ItemDeleteCompleteDTO itemMatchInfo(String itemId, String itemName) throws SQLException {

		int itemIdI = Integer.parseInt(itemId);

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setInt(1, itemIdI);
			preparedStatement.setString(2, itemName);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				itemDeleteCompleteDTO.setItemId(resultSet.getInt("id"));
				itemDeleteCompleteDTO.setItemName(resultSet.getString("item_name"));
			}

		}catch (SQLException e){
			e.printStackTrace();
		} finally{
			connection.close();
		}

		return itemDeleteCompleteDTO;

	}

	private String sql2 = "DELETE FROM item_info_transaction where id = ? AND item_name = ? ";

	public void itemDeleteInfo(String itemId, String itemName) throws SQLException {

		int itemIdI = Integer.parseInt(itemId);

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.setInt(1, itemIdI);
			preparedStatement.setString(2, itemName);

			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			connection.close();
		}
	}


}
