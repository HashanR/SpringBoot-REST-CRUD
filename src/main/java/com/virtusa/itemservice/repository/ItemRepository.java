package com.virtusa.itemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.itemservice.modal.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	
}
