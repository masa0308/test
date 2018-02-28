package com.internousdev.ecsite.dao;

import java.sql.Connection;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemAddCompleteDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateutil = new DateUtil();

	private String sql = "INSERT INTO item_info_transaction (item_name, item_price, item_stock, insert_date) VALUES(?, ?, ?, ?)";

	public void registerItem(String itemname, int itempriceInt, int itemstockIntString ){

	}


}
