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

	private String count;

	private String pay;

	public Map<String, Object> session;

	public String execute() {
		String result = SUCCESS;

		System.out.println(pay);

		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(count);
		String[] itemNameList = itemName.split(", ",0);
		String[] itemPriceList = itemPrice.split(", ",0);
		String[] countList = String.valueOf(count).split(", ",0);
		String[] payList = pay.split(", ", 0);

		System.out.println(itemNameList.length);
		System.out.println(itemPriceList.length);
		System.out.println(countList.length);
		System.out.println(payList.length);

		System.out.println(checkList.size());

		List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

		System.out.println("チェックリスト");
		int totalPrice = 0;
		for(String check : checkList){
			System.out.println(check);
			BuyItemDTO dto = new BuyItemDTO();
			dto.setItemName(itemNameList[Integer.parseInt(check) -1 ].toString());
			dto.setItemPrice(itemPriceList[Integer.parseInt(check) -1].toString());
			dto.setCount(countList[Integer.parseInt(check) -1].toString());
			String payment;
			if(payList[0].toString().equals("1")){
				payment = "現金払い";
				dto.setPay(payment);
			}else {

				payment = "クレジットカード";
				dto.setPay(payment);
			}
			buyItemDTOList.add(dto);

//			int intCount = Integer.parseInt(count);
//			int intPrice = Integer.parseInt(itemPrice);

			totalPrice = totalPrice + (Integer.parseInt(countList[Integer.parseInt(check) -1]) * Integer.parseInt(itemPriceList[Integer.parseInt(check) -1]));

//			session.put("total_price", intCount * intPrice);
			session.put("buyItemDTOList", buyItemDTOList);
			session.put("total_price", totalPrice);

		}

//
//
//		for(int i=0; i < itemNameList.length; i++){
//			BuyItemDTO dto = new BuyItemDTO();
//			dto.setItemName(itemNameList[i].toString());
//			dto.setItemPrice(itemPriceList[i].toString());
//			dto.setCount(countList[i].toString());
//
//			String payment;
//			if(payList[i].toString().equals("1")){
//				payment = "現金払い";
//				dto.setPay(payment);
//			}else {
//
//				payment = "クレジットカード";
//				dto.setPay(payment);
//			}
//			buyItemDTOList.add(dto);
//
//		}

//		List<String> itemList = new ArrayList<String>();
//		List<String> priceList = new ArrayList<String>();
//		List<String> countList = new ArrayList<String>();
//		List<String> payList = new ArrayList<String>();
//
//		List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();
//
//		for (int i = 0; i < itemNameList.length; i++){
//			itemList.add( String.valueOf(itemNameList[i]));
//		}
//		for (int i = 0; i < itemPriceList.length; i++){
//			priceList.add( String.valueOf(itemPriceList[i]));
//		}
//		for (int i = 0; i < countList.length; i++){
//			countList.add( String.valueOf(countList[i]));
//		}
//		for (int i = 0; i < payList.length; i++){
//			price.add( String.valueOf(payList[i]));
//		}
//
//		for(int i = 0; i < itemNameList.length; i++){
//			BuyItemDTO dto = new BuyItemDTO();
//			dto.setItemName(item.get(i));
//		}
//
//		for(String check : checkList){
//			BuyItemDTO dto = new BuyItemDTO();
//			dto.setItemName(itemNameList[Integer.parseInt(check)].toString());
//			dto.setItemPrice(itemPriceList[Integer.parseInt(check)].toString());
//			dto.setCount(countList[Integer.parseInt(check)].toString());
//
//			String payment;
//			if(payList[Integer.parseInt(check)].toString().equals("1")){
//				payment = "現金払い";
//				dto.setPay(payment);
//			}else {
//
//				payment = "クレジットカード";
//				dto.setPay(payment);
//			}
//
//
//			buyItemDTOList.add(dto);
//		}

//		if (check.equals("on")) {
//			session.put("itemName", itemName);
//			session.put("itemPrice", itemPrice);
//			session.put("count", count);
//			int intCount = Integer.parseInt(session.get("count").toString());
//			int intPrice = Integer.parseInt(session.get("itemPrice").toString());
//		int intCount = Integer.parseInt(count);
//		int intPrice = Integer.parseInt(itemPrice);
//			session.put("total_price", intCount * intPrice);
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

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
