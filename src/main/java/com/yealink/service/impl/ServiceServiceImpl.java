package com.yealink.service.impl;

import com.yealink.dao.TagDao;
import com.yealink.entities.Service;
import com.yealink.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private TagDao tagDao;

    @Override
    public void registerService(Service service) {

    }

    @Override
    public Map<String, String[]> getServiceCatalog() {
        //先获得Service集合
        return null;
    }
}
