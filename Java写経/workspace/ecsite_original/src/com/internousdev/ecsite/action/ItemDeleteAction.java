package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteAction extends ActionSupport{

	private String itemId;

	private String itemName;

	private String result;

	private String errorMessage;

	public String execute(){

		if(!(itemId.equals("")) && !(itemName.equals(""))){
			result = SUCCESS;
		} else {
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}

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



	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
