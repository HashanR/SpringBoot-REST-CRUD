package com.virtusa.itemservice.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.itemservice.modal.Category;
import com.virtusa.itemservice.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService catService;
	
	@PostMapping("/category")
	public Category save(@RequestBody Category category) {
		
		return catService.save(category);
	}
	
	
	
	@GetMapping("/category")
	public List<Category> fetchAll() {
		return catService.fetchAll();
	}
	
	
	
	@GetMapping("/category/{id}")
	public Optional<Category> fetch(@PathVariable Integer id){
		
		return catService.fetchById(id);
	}
	
	
	@PutMapping("/category/{id}")
	public Category updateCategory(@RequestBody Category category,@PathVariable Integer id) {
		
		
		return catService.update(category, id);
		
	}
	
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable Integer id)
	{
		catService.delete(id);
	}

}
