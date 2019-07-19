package com.yealink.service.impl;

import com.yealink.dao.ServiceDao;
import com.yealink.dao.TagDao;
import com.yealink.entities.Service;
import com.yealink.entities.Tag;
import com.yealink.service.ServiceService;
import com.yealink.utils.TagUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private TagDao tagDao;
    
    @Autowired
    private ServiceDao serviceDao;

    @Override
    public void registerService(Service service) {

    }

    @Override
    public Map<String, String[]> getServiceCatalog() {
        Map<String,String[]> map = new HashMap<>();
        //先获得Service集合
        List<String> serviceNameList = serviceDao.selectAllServiceName();
        //遍历每个serviceName，将其所对应的Tag存入Map
        for(String serviceName : serviceNameList){
            List<Tag> tagList = tagDao.selectByService(serviceName);
            String[] valueArray = TagUtil.tagListToStringArray(tagList);
            map.put(serviceName,valueArray);
        }
        return map;
    }
}
