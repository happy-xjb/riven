package com.yealink.controller;

import com.yealink.dao.ServiceDao;
import com.yealink.entities.Service;
import com.yealink.vo.ServiceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private ServiceDao serviceDao;

    @GetMapping("/select/1")
    public Service testSelectById(){
        return serviceDao.selectById("1");
    }
    @GetMapping("/test")
    public String test(){
        return "hello boot";
    }

    @GetMapping("/service")
    public Map testService(){
        ServiceVO serviceVO1 = new ServiceVO();
        String[] tags = {"version=1","address=127.0.0.1"};
        serviceVO1.setId("1").setService("redis").setAddress("127.0.0.1").setPort("8080").setTags(tags);
        ServiceVO serviceVO2 = serviceVO1;
        serviceVO2.setId("2");
        Map<String,ServiceVO> map = new HashMap<>();
        map.put("1",serviceVO1);
        map.put("2",serviceVO2);
        return map;
    }

}
