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
	public Category saveCategory(@RequestBody Category cat) {
		
		return catService.save(cat);
	}
	
	
	
	@GetMapping("/category")
	public List<Category> fetchAllCategories() {
		return catService.fetchAll();
	}
	
	
	
	@GetMapping("/category/{id}")
	public Optional<Category> fetchCategory(@PathVariable Integer id){
		
		return catService.fetchCategory(id);
	}
	
	
	@PutMapping("/category/{id}")
	public Category updateCategory(@RequestBody Category cat,@PathVariable Integer id) {
		
		
		return catService.updateCategory(cat, id);
		
	}
	
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable Integer id)
	{
		catService.deleteCategory(id);
	}

}
