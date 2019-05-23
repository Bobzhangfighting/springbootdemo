package com.example.demo.mapper;

import com.example.demo.entity.DemoUser;

import java.util.List;
import java.util.Map;

/**
 * created by zhangtao on 2019/5/22
 */
public interface DemoUserMapper {

    List<Map<String,Object>> getUserInfo();

    DemoUser getMessageById(String id);
}
