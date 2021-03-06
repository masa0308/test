package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.ItemAddCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAddCompleteAction extends ActionSupport{

	private String itemname;

	private String itemprice;

	private String itemstock;

	private String result;

	private String errorMessage;

	private int res;

	private ItemAddCompleteDAO itemAddCompleteDAO = new ItemAddCompleteDAO();

	/**
	 * 商品情報登録
	 */
	public String execute() throws SQLException {

		res = itemAddCompleteDAO.registerItem(itemname, itemprice, itemstock);

		if(res>0){

			result = SUCCESS;


		}else if(res <= 0){

			setErrorMessage("更新できませんでした");
			result = ERROR;


		}

		return result;

	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}


	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getItemprice() {
		return itemprice;
	}

	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}

	public String getItemstock() {
		return itemstock;
	}

	public void setItemstock(String itemstock) {
		this.itemstock = itemstock;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

}
