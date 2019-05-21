package com.virtusa.itemservice.service;

import java.util.List;

import com.virtusa.itemservice.modal.Item;

public interface ItemService {
	
	Item save(Item item);
	List<Item> fetchAllItems();
	Item  fetchItemById(Item item);
	Item updateItem(Item item);
	void deleteItem(Integer id);

	
	
	

}
