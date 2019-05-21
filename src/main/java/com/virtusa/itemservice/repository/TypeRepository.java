package com.virtusa.itemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.itemservice.modal.Types;


@Repository
public interface TypeRepository extends JpaRepository<Types, Integer	> {

}
