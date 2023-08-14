package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entidades.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
