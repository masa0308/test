package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{

	/**
	 * 商品一覧情報DAO
	 */
	private ItemListDAO itemListDAO = new ItemListDAO();

	/**
	 * 商品一覧情報DTO
	 */
	public ArrayList<ItemListDTO> itemListDTO = new ArrayList<ItemListDTO>();


	public String execute() throws SQLException {

		itemListDTO = itemListDAO.getItemListInfo();

		Iterator<ItemListDTO> iterator = itemListDTO.iterator();

		if(!(iterator.hasNext())) {
			itemListDTO = null;
		}

		String result = SUCCESS;
		return result;
	}

}
