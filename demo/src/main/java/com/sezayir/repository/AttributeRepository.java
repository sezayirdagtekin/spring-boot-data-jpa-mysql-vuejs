package com.sezayir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sezayir.model.Attribute;


public interface AttributeRepository extends JpaRepository<Attribute, Long> {
	
	List<Attribute> findByTitleContaining(String title);
}
