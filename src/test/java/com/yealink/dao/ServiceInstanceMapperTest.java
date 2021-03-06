package com.yealink.dao;

import com.yealink.entities.ServiceInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceInstanceMapperTest {
    @Autowired
    private ServiceInstanceMapper serviceInstanceMapper;

    @Test
    public void selectAll(){
        List<ServiceInstance> serviceInstances = serviceInstanceMapper.selectAll();
        System.out.println(serviceInstances);
    }
}