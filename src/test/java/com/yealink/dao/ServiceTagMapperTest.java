package com.yealink.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceTagMapperTest {
    @Autowired
    ServiceTagMapper serviceTagMapper;

    @Test
    public void selectByServiceId(){
        List<String> list = serviceTagMapper.selectByServiceId("myapp_01");
        System.out.println(list);
    }

    @Test
    public void deleteAllByServiceId(){
        int num = serviceTagMapper.deleteAllByServiceId("myqq_05");
        System.out.println(num);
    }

}