package com.virtusa.itemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.itemservice.modal.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
