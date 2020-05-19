package com.maruf.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maruf.model.UserRecord;
import com.maruf.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<UserRecord> getAllUsers() {
		List<UserRecord> userRecords = new ArrayList<>();
		userRepository.findAll().forEach(userRecords::add);
		return userRecords;
	}

	public void addUser(UserRecord userRecord) {
		userRepository.save(userRecord);
	}
}
