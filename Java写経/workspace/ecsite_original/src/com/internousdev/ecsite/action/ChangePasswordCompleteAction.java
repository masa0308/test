package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ChangePasswordCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String changePassword;

	public Map<String,Object> session;

	private String result;

	private String wrongMessage;

	private ChangePasswordCompleteDAO changePasswordCompleteDAO = new ChangePasswordCompleteDAO();

	public String execute() throws SQLException {

		result = ERROR;



		boolean boo = changePasswordCompleteDAO.getUserInfo(session.get("loginUserId").toString(), session.get("loginPassword").toString());

		if(boo==true){


		changePasswordCompleteDAO.changeUser(session.get("loginUserId").toString(), session.get("loginPassword").toString(), session.get("changePassword").toString());


		result = SUCCESS;



		} else {
			setWrongMessage("IDまたはパスワードが間違っています。");
		}

		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword= loginPassword;
	}

	public String getChangePassword(){
		return changePassword;
	}

	public void setChangePassword(String changePassword){
		this.changePassword= changePassword;
	}


	public String getWrongMessage() {
		return wrongMessage;
	}

	public void setWrongMessage(String wrongMessage) {
		this.wrongMessage = wrongMessage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
