package com.yealink.service.impl;

import com.yealink.service.ServiceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceServiceImplTest {
    @Autowired
    private ServiceService serviceService;

    @Test
    public void registerService() {
    }

    @Test
    public void getServiceCatalog() {
        Map<String, String[]> serviceCatalog = serviceService.getServiceCatalog();
        System.out.println(serviceCatalog);
    }
}