package com.sezayir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sezayir.dao.AttributeDao;
import com.sezayir.model.Attribute;

@Service
public class AttributeService {

	@Autowired
	AttributeDao attributeDao;

	public List<Attribute> getAllAttributes() {
		return attributeDao.getAllAtributes();
	}

}
