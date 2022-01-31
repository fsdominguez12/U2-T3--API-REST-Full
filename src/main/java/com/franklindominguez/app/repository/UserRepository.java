package com.franklindominguez.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklindominguez.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	
}
