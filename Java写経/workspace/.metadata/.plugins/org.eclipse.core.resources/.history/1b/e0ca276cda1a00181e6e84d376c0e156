package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String changePassword;

	public Map<String, Object> session;

	private String result;

	private String errorMessage;

	public String execute() {

		result = SUCCESS;

		if(!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(changePassword.equals(""))) {
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("changePassword", changePassword);
		} else {

			setErrorMessage("未入力項目があります。");
			result = ERROR;
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

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getChangePassword(){
		return changePassword;
	}

	public void setChangePassword(String changePassword){
		this.changePassword = changePassword;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

}
