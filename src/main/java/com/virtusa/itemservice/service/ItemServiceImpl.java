package com.virtusa.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtusa.itemservice.modal.Item;
import com.virtusa.itemservice.repository.ItemServiceRepository;

public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemServiceRepository itemServiceRepository;

	@Override
	public Item save(Item item) {
		
		return itemServiceRepository.save(item);
		
		
	}

	@Override
	public List<Item> fetchAllItems() {
		
		return itemServiceRepository.findAll();
	}

	@Override
	public Item fetchItemById(Item item) {
		
		Optional<Item> optionalItem=itemServiceRepository.findById(item.getId());
		if(optionalItem.isPresent()) {
			return optionalItem.get();
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public Item updateItem(Item item) {

	   Optional<Item> optionalItem=itemServiceRepository.findById(item.getId());
	   if(optionalItem.isPresent()) {
		   
		   return itemServiceRepository.save(item);
	   }
	   else
	   {
		   return null;
		   
	   }
		
		
		
		
	}

	@Override
	public void deleteItem(Integer id) {
		
		
		itemServiceRepository.deleteById(id);
		
	}
	
	
}
