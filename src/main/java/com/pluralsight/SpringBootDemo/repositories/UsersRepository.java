package com.pluralsight.SpringBootDemo.repositories;

import org.springframework.data.repository.Repository;

import com.pluralsight.SpringBootDemo.model.Users;

public interface UsersRepository extends Repository<Users, Long>{
	
	public Users getUsers();
	
	Users getById(Long id);
	
	Users getByNativeQuery(String username) ;
	
	Users getByNamedQuery(Long id, String username, String lastname);
	
	Users getByQuery(Long id);
	
	String saveUser(Users users);
	

}
