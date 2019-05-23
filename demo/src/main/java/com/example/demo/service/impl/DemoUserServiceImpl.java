package com.example.demo.service.impl;

import com.example.demo.entity.DemoUser;
import com.example.demo.mapper.DemoUserMapper;
import com.example.demo.service.DemoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * created by zhangtao on 2019/5/22
 */
@Service
public class DemoUserServiceImpl implements DemoUserService {

    @Autowired
    private DemoUserMapper demoUserMapper;

    @Override
    public List<Map<String,Object>> getUserInfo() {
        return demoUserMapper.getUserInfo();
    }

    @Override
    public DemoUser getMessageById(String id) {
        return demoUserMapper.getMessageById(id);
    }
}
