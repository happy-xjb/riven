package com.yealink.dao;

import com.yealink.App;
import com.yealink.entities.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class ServiceDaoTest {

    @Autowired
    private ServiceDao serviceDao;

    @Test
    public void testSelectById(){
        Service service = serviceDao.selectById("1");
        System.out.println(service);
    }

    @Test
    public void testInsert(){
        Service service = new Service();
        service.setId("3").setService("redis").setAddress("12123213").setNodeId("1").setPort("8090");
        serviceDao.insert(service);
    }

    @Test
    public void selectAllHealthyService(){
        List<Service> allHealthyService = serviceDao.selectAllHealthyService();
        assertEquals(allHealthyService.size(),2);
    }

    @Test
    public void selectAll(){
        List<Service> services = serviceDao.selectAll();
        assertEquals(3,services.size());
    }
}