package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	/**
	 * アイテム情報格納
	 */
	public ArrayList<BuyItemDTO> buyItemList = new ArrayList<BuyItemDTO>();

	public String execute() {
		String result = "login";
		if(session.containsKey("id")) {
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			//BuyItemDTO buyItemDTO = new BuyItemDTO();
			buyItemList = buyItemDAO.getBuyItemInfo();

			//session.put("id", buyItemDTO.getId());

			session.put("buyItemList", buyItemList);
			/**
			 * session.put("id", buyItemDTO.getId());
			 * session.put("buyItem_name", buyItemDTO.getItemName());
			 * session.put("buyItem_price", buyItemDTO.getItemPrice());
			 */


			result = SUCCESS;
		}

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

}
