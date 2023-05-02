package com.orderproc.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.orderproc.model.LoginDetails;

public interface LoginDetailsRepository extends CrudRepository<LoginDetails, Integer> {
	Optional<LoginDetails> findByEmail(String emailId);
}
