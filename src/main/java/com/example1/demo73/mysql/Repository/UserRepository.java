package com.example1.demo73.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.demo73.mysql.domain.User;

public interface UserRepository extends JpaRepository<User,Long>{
	User findByName(String name);

}
