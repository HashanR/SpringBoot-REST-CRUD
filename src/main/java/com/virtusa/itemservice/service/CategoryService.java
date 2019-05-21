package com.virtusa.itemservice.service;

import java.util.List;
import java.util.Optional;

import com.virtusa.itemservice.modal.Category;


public interface CategoryService {
	
	Category save(Category category);
	List<Category> fetchAll();
	Optional<Category> fetchCategory(Integer id);
	Category updateCategory(Category cat, Integer id);
	void deleteCategory(Integer id);
}
