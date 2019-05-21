package com.virtusa.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.itemservice.modal.Category;
import com.virtusa.itemservice.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;

	@Override
	public Category save(Category cat) {
		
		return categoryRepo.save(cat);
	}

	@Override
	public List<Category> fetchAll() {
		
		return categoryRepo.findAll();
	}

	@Override
	public Optional<Category> fetchById(Integer id) {
		
		return categoryRepo.findById(id);
	}

	@Override
	public Category update(Category cat, Integer id) {
		
		return categoryRepo.findById(id).map(category->
		{
			category.setName(cat.getName());
			category.setType(cat.getType());
			return categoryRepo.save(category);
		}).orElseGet( ()->{
			
			cat.setId(id);
			return categoryRepo.save(cat);
				
			
		});
	}

	@Override
	public void delete(Integer id) {
	
		categoryRepo.deleteById(id);
		
		
	}

}
