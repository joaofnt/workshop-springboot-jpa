package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entidades.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
