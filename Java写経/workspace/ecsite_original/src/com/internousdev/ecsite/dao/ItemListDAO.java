package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	/**
	 * 商品一覧取得
	 */

	public ArrayList<ItemListDTO> getItemListInfo() throws SQLException {

		ArrayList<ItemListDTO> itemListDTO = new ArrayList<ItemListDTO>();

		String sql = "SELECT * from item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
			ItemListDTO dto = new ItemListDTO();
			dto.setId(resultSet.getString("id"));
			dto.setItemName(resultSet.getString("item_name"));
			dto.setItemPrice(resultSet.getString("item_price"));
			dto.setItemStock(resultSet.getString("item_stock"));
			dto.setInsertDate(resultSet.getString("insert_date"));
			dto.setUpdateDate(resultSet.getString("update_date"));
			itemListDTO.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return itemListDTO;
	}



}
