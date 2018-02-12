package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String loginUserId;

	private String loginPassword;

	public String execute(){
		String ret = ERROR;
		System.out.println(loginUserId);
		System.out.println(loginPassword);
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto = dao.select(loginUserId,loginPassword);

		if(this.loginUserId.equals(dto.getLoginUserId()) && this.loginPassword.equals(dto.getLoginPassword())){
			ret=SUCCESS;
		}else {
			ret=ERROR;
		}
		return ret;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	}