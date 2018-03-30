package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MyPageDAO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {

	private String id;

	public Map<String ,Object> session;

	private MyPageDAO myPageDAO = new MyPageDAO();

	public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	private String deleteFlg;

	private String message;

	public String execute() throws SQLException {

		if(!session.containsKey("id")) {
			return ERROR;
		}

		if(deleteFlg == null) {

			//System.out.println("id = " + id);
            //String[] idList = id.split(", ",0);

            //String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();

			//for(int i=0; i<idList.length; i++){
			//MyPageDAO myPageDAO = new MyPageDAO();

			myPageList = myPageDAO.getMyPageUserInfo(user_master_id);

			myPageDAO = null;



			Iterator<MyPageDTO> iterator = myPageList.iterator();
			if(!(iterator.hasNext())) {
				myPageList = null;
			}

		} else if(deleteFlg.equals("1")) {
			delete();
		}

		String result = SUCCESS;
		return result;

	}

	public void delete() throws SQLException {

		//String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(user_master_id);

		if(res > 0) {
			myPageList = null;
			setMessage("商品情報を正しく削除しました。");
		} else if(res == 0){
			setMessage("商品情報の削除に失敗しました。");
		}
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
