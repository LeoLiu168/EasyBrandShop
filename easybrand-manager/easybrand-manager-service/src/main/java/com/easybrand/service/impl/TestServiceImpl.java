package com.easybrand.service.impl;

import com.easybrand.mapper.TestMapper;
import com.easybrand.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper mapper;

    public String queryNow() {
        return mapper.queryNow();
    }
}
