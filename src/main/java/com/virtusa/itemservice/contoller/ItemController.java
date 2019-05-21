package com.virtusa.itemservice.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.itemservice.modal.Item;
import com.virtusa.itemservice.service.ItemService;

@RestController()
@RequestMapping("/item")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@PostMapping("/item")
	public Item save(@RequestBody Item item) {
		
		return itemService.save(item);
		
	}

}
