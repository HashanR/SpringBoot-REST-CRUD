package com.virtusa.itemservice.service;

import java.util.List;
import java.util.Optional;

import com.virtusa.itemservice.modal.Item;

public interface ItemService {
	
	
	Item save(Item item);
	List<Item> fetchAll();
	Optional<Item> fetchById(Integer id);
	Item update(Item item, Integer id);
	void delete(Integer id);

	
	
	

}
