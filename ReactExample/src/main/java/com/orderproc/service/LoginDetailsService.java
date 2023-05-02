package com.orderproc.service;

import com.orderproc.model.LoginDetails;

public interface LoginDetailsService {
	public LoginDetails login(LoginDetails loginDetails);
	
	public LoginDetails getLoginDetails(String emailId);
}
