package com.pluralsight.SpringBootDemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.SpringBootDemo.model.Users;
import com.pluralsight.SpringBootDemo.repositories.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;
	
	public Users getUsers(Long id, String username, String lastname) {
		return usersRepository.getByNamedQuery(id, username, lastname);
}
	
	public String saveUser(Users users) {
		return usersRepository.saveUser(users);
	}
	
	public Users getUsers(Long id) {
		return usersRepository.getByQuery(id);
	}
	
	public Users getUserBySqlQuey(String username) {
		
		return usersRepository.getByNativeQuery(username);
		
	}
}
