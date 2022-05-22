package com.crud.actions.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.actions.vo.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
}
