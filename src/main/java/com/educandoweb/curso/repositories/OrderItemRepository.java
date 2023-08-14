package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entidades.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
