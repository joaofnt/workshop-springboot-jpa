package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entidades.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
