package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	private String itemName;

	private String itemPrice;

	private Collection<String> checkList;

	private int count;

	private String pay;

	public Map<String, Object> session;

	public String execute() {
		String result = SUCCESS;


		String[] itemNameList = itemName.split(", ",0);
		String[] itemPriceList = itemPrice.split(", ",0);
		String[] countList = String.valueOf(count).split(", ",0);
		String[] payList = pay.split(", ", 0);

		List<String> item = new ArrayList<String>();
		List<String> price = new ArrayList<String>();
		List<String> count = new ArrayList<String>();
		List<String> pay = new ArrayList<String>();

		List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

		for (int i = 0; i < itemNameList.length; i++){
			item.add( String.valueOf(itemNameList[i]));
		}
		for (int i = 0; i < itemPriceList.length; i++){
			price.add( String.valueOf(itemPriceList[i]));
		}
		for (int i = 0; i < countList.length; i++){
			price.add( String.valueOf(countList[i]));
		}
		for (int i = 0; i < payList.length; i++){
			price.add( String.valueOf(payList[i]));
		}

		for(int i = 0; i < itemNameList.length; i++){
			BuyItemDTO dto = new BuyItemDTO();
			dto.setItemName(item.get(i));
		}

		for(String check : checkList){
			BuyItemDTO dto = new BuyItemDTO();
			dto.setItemName(itemNameList[Integer.parseInt(check)].toString());
			dto.setItemPrice(itemPriceList[Integer.parseInt(check)].toString());
			dto.setCount(countList[Integer.parseInt(check)].toString());

			String payment;
			if(payList[Integer.parseInt(check)].toString().equals("1")){
				payment = "現金払い";
				dto.setPay(payment);
			}else {

				payment = "クレジットカード";
				dto.setPay(payment);
			}


			buyItemDTOList.add(dto);
		}

//		if (check.equals("on")) {
//			session.put("itemName", itemName);
//			session.put("itemPrice", itemPrice);
//			session.put("count", count);
			int intCount = Integer.parseInt(session.get("count").toString());
			int intPrice = Integer.parseInt(session.get("itemPrice").toString());

			session.put("total_price", intCount * intPrice);
//			String payment;
//
//			if (pay.equals("1")) {
//
//				payment = "現金払い";
//				session.put("pay", payment);
//			} else {
//
//				payment = "クレジットカード";
//				session.put("pay", payment);
//			}
//		}

		return result;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

//	public String getCheck() {
//		return check;
//	}
//
//	public void setCheck(String check) {
//		this.check = check;
//	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
