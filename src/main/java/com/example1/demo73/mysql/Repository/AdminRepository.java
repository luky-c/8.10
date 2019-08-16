package com.example1.demo73.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.demo73.mysql.domain.Admin;

public interface AdminRepository  extends JpaRepository<Admin,Long> {
	Admin findByName(String name);
}
