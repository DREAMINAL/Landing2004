package com.dk.landing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.landing.dao.TestDao;
import com.dk.landing.model.TestModel;
import com.dk.landing.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao dao;
	
	@Override
	public TestModel printTest() {
		TestModel test = dao.getTest();
		return test;
	}
	
}
