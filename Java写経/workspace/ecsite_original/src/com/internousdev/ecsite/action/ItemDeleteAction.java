package com.internousdev.ecsite.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteAction extends ActionSupport{

	private String itemId;

	private String itemName;

	private String result;

	private String errorMessage;

	public String execute(){


        //空白が無いかチェック
		if((itemId.equals("")) || (itemName.equals(""))){
			setErrorMessage("未入力の項目があります。");

			result = ERROR;

			return result;

		}

		//idに数字が入っているかチェック
	    Pattern p = Pattern.compile("^[0-9]*$");
	    Matcher itemIdm = p.matcher(itemId);

	    boolean boo = itemIdm.matches();

	    if(!boo){
	    	setErrorMessage("商品IDは数字を入れてください");

	    	result = ERROR;

	    	return result;
	    }

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
