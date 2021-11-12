package com.arturdev.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturdev.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
