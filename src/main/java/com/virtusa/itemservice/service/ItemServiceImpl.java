package com.virtusa.itemservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.itemservice.modal.Item;
import com.virtusa.itemservice.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	
	@Autowired
	ItemRepository itemRepo;
	
	
	@Override
	public Item save(Item item) {
		
		return itemRepo.save(item);
	}

	@Override
	public List<Item> fetchAll() {
		
		return itemRepo.findAll();
	}

	@Override
	public Optional<Item> fetchById(Integer id) {
		
		return itemRepo.findById(id);
	}

	@Override
	public Item update(Item item, Integer id) {
		
		return null;
	}

	@Override
	public void delete(Integer id) {
		
		itemRepo.deleteById(id);
		
	}

	
	
	
}
