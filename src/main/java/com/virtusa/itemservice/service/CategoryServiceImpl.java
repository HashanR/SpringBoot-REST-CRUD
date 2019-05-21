package com.virtusa.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.itemservice.modal.Category;
import com.virtusa.itemservice.repository.CategoryServiceRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryServiceRepository catRepo;

	@Override
	public Category save(Category cat) {
		
		return catRepo.save(cat);
	}

	@Override
	public List<Category> fetchAll() {
		
		return catRepo.findAll();
	}

	@Override
	public Optional<Category> fetchById(Integer id) {
		
		return catRepo.findById(id);
	}

	@Override
	public Category update(Category cat, Integer id) {
		
		return catRepo.findById(id).map(category->
		{
			category.setName(cat.getName());
			category.setType(cat.getType());
			return catRepo.save(category);
		}).orElseGet( ()->{
			
			cat.setId(id);
			return catRepo.save(cat);
				
			
		});
	}

	@Override
	public void delete(Integer id) {
	
		catRepo.deleteById(id);
		
		
	}

}
