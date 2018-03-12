package com.internousdev.ecsite.action;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemAddConfirmAction extends ActionSupport implements SessionAware{

	private String itemname;

	private String itemprice;

	private String itemstock;

	private int itempriceInt;

	private int itemstockInt;

	public Map<String, Object> session;

	private String result;

	private String errorMessage;

	public String execute(){



		// 入力に空白がないかチェック
		if(itemname.equals("") || (itemprice.equals("")) || (itemstock.equals(""))){
			setErrorMessage("未入力の項目があります。");

			result = ERROR;

			return result;

		}

		// 値段・品数に文字が入っていないかチェック
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher itempricem = p.matcher(itemprice);
		Matcher itemstockm = p.matcher(itemstock);

		boolean boo1 = itempricem.matches();
		boolean boo2 = itemstockm.matches();

		if(!(boo1) || !(boo2) ){
			setErrorMessage("値段・品数には数字を入れてください");

			result = ERROR;

			return result;
		}


		// 数字は0より大きいかチェック
		int itempriceInt = Integer.parseInt(itemprice);
		int itemstockInt = Integer.parseInt(itemstock);


		if (itempriceInt <= 0 || itemstockInt <= 0) {
			setErrorMessage("値段・品数は1以上の数字を入れてください");

			result = ERROR;

			return result;
		}else{

		result = SUCCESS;
		return result;

		}


		}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getItempriceInt() {
		return itempriceInt;
	}

	public void setItempriceInt(int itempriceInt) {
		this.itempriceInt = itempriceInt;
	}

	public int getItemstockInt() {
		return itemstockInt;
	}

	public void setItemstockInt(int itemstockInt) {
		this.itemstockInt = itemstockInt;
	}
}