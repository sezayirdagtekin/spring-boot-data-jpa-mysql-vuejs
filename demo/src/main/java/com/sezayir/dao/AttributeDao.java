package com.sezayir.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sezayir.model.Attribute;
import com.sezayir.repository.AttributeRepository;

@Component
public class AttributeDao {
	@Autowired
	AttributeRepository attributeRepository;

	public List<Attribute> getAllAtributes() {
		return attributeRepository.findAll();
	}

}
