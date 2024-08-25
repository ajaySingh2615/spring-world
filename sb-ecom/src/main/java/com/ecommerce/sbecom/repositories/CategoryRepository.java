package com.ecommerce.sbecom.repositories;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.sbecom.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    Category findByCategoryName(String categoryName);
}
