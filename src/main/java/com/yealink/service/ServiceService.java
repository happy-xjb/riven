package com.yealink.service;

import com.yealink.entities.Service;

import java.util.Map;

public interface ServiceService {
    public void registerService(Service service);
    public Map<String,String[]> getServiceCatalog();
}
