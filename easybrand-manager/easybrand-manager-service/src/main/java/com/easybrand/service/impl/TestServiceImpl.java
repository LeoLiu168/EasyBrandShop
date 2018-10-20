package com.easybrand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easybrand.mapper.TestMapper;
import com.easybrand.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestMapper mapper;

	@Override
	public String queryNow() {
		return mapper.queryNow();
	}

}
