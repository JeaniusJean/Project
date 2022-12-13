package com.ticktask.springboot.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ticktask.springboot.webapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u from USER u WHERE u.email=?1")
  User findByEmail(String email);

}
