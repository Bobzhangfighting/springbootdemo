package com.example.demo.controller;

import com.example.demo.common.DescribeException;
import com.example.demo.common.ExceptionEnum;
import com.example.demo.common.ResultBean;
import com.example.demo.common.ResultCodeConstant;
import com.example.demo.service.DemoUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zhangtao
 * @Description: 代码质量示例demo
 * @Param:
 * @Return:
 * @Create: 2019/5/22 9:50
 * @version v1.0
 */
@Slf4j
@RestController
@RequestMapping
public class DemoController {


    @Autowired
    private DemoUserService demoUserService;

    /**
     *
     * @return 返回所有用户数据
     */
    @GetMapping(value ="/getMessage")
    @ResponseBody
    public ResultBean getDemoUser(){
        try{
           // int i = 1/0;
            log.info("hhahahahh");
        }catch (Exception e){
            throw new DescribeException(e.getMessage(), ResultCodeConstant.FAIL_SYS_CODE);
        }
        return new ResultBean(demoUserService.getUserInfo());
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    @ResponseBody
    public ResultBean getDemoUserById(@PathVariable String id){
        return  new ResultBean(demoUserService.getMessageById(id));
    }
}

