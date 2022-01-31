package com.franklindominguez.app.service;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.franklindominguez.app.entity.User;
import com.franklindominguez.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<User> findAll() {
		
		return userRepository.findAll();
	}
	
	
	/*
	@Override
	public Page<User> findAll(Pageable pageable) {
		return userRepository.findAll(pageable) ;
	}
	*/
	
	@Override
	@Transactional(readOnly=true)
	public Optional<User> findById(Long id) {
		
		return userRepository.findById(id);
	}
	

	@Override
	@Transactional
	public User save(User user) {
		
		return userRepository.save(user);
	}
	

	@Override
	@Transactional
	public void deleteById(Long id) {
		userRepository.deleteById(id);
		
	}






	





	




	




	

	
}
