package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.internousdev.ecsite.dto.ItemDeleteCompleteDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport {

	private String itemId;

	private String itemName;

	private String result;

	private ItemDeleteCompleteDAO itemDeleteCompleteDAO = new ItemDeleteCompleteDAO();

	private ItemDeleteCompleteDTO itemDeleteCompleteDTO = new ItemDeleteCompleteDTO();

	/**
	 * 商品削除
	 *
	 */

    public String execute() throws SQLException {

    	//削除以来のアイテムが実際に在るかチェック
    	itemDeleteCompleteDTO = itemDeleteCompleteDAO.itemMatchInfo(itemId, itemName);

    	if(!(itemId.equals(itemDeleteCompleteDTO.getItemId())) || !(itemName.equals(itemDeleteCompleteDTO.getItemName()))){

    		result = ERROR;

    		return result;
    	}

        //アイテムを削除
    	itemDeleteCompleteDAO.itemDeleteInfo(itemId, itemName);

    	result = SUCCESS;

    	return result;

    }


	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
