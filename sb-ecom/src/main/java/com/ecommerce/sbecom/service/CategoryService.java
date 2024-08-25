package com.ecommerce.sbecom.service;

import com.ecommerce.sbecom.payload.CategoryDTO;
import com.ecommerce.sbecom.payload.CategoryResponse;

public interface CategoryService {

    CategoryResponse getAllCategories();

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
