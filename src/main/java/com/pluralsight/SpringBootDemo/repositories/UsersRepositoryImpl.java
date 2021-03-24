package com.pluralsight.SpringBootDemo.repositories;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.SpringBootDemo.model.Users;

public class UsersRepositoryImpl implements UsersRepository {

	@Autowired
	EntityManager entityManager; 
	
	
	@Autowired
	private UsersRepository repository;
	
	@Override
	public Users getUsers() {
		return repository.getUsers();
	}

	@Override
	public Users getById(Long id) {
		return repository.getById(id);
	}
	
	@Override
	public Users getByNativeQuery(String username) {
		@SuppressWarnings("unchecked")
		Query<Users> query = (Query<Users>) entityManager.createNativeQuery("Select * from users where username='"+username+"'");
		query.setMaxResults(3);
		return (Users) query.getResultList();
		
	}
	
	@Override
	public Users getByNamedQuery(Long id, String username, String lastname) {
		Optional<String> optionalUsername=Optional.ofNullable(username);
		Query<Users> query= (Query<Users>) entityManager.createNamedQuery("userFetch");
		optionalUsername.ifPresent(c->query.setParameter("user", c));
		return (Users) query.getSingleResult();
		
	}
	@Override
	public Users getByQuery(Long id) {
		Optional<Long> optionalLong=Optional.ofNullable(id);
		Query<Users> query=(Query<Users>) entityManager.createQuery("from Users where id= :id");
		optionalLong.ifPresent(i->query.setParameter("id", i));
		return query.getSingleResult();
	}

	@Override
	@Transactional
	public String saveUser(Users users) {
		try {
			entityManager.persist(users);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "User saved succesfully";
	}


}
;
