package com.maruf.repository;

import org.springframework.data.repository.CrudRepository;

import com.maruf.model.UserRecord;


public interface UserRepository extends CrudRepository<UserRecord, String> {
}
