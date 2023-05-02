package com.orderproc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderproc.model.LoginDetails;
import com.orderproc.repo.LoginDetailsRepository;

@Service
public class LoginServiceImpl implements LoginDetailsService {
	
	@Autowired
	LoginDetailsRepository loginrepo;
	@Override
	public LoginDetails login(LoginDetails loginDetails) {
		
		return loginrepo.save(loginDetails);
	}

	@Override
	public LoginDetails getLoginDetails(String emailId) {
 Optional<LoginDetails> optional = loginrepo.findByEmail(emailId);
 return optional.get();
}

}
