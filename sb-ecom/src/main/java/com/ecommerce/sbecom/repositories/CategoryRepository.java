package com.ecommerce.sbecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.sbecom.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
