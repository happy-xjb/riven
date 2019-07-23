package com.yealink.service.impl;

import com.ecwid.consul.v1.health.model.Check;
import com.yealink.dao.CheckMapper;
import com.yealink.dao.NodeMapper;
import com.yealink.dao.ServiceInstanceMapper;
import com.yealink.dao.ServiceTagMapper;
import com.yealink.entities.Node;
import com.yealink.entities.ServiceInstance;
import com.yealink.service.HealthService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HealthServiceImpl implements HealthService {
    @Autowired
    ServiceInstanceMapper serviceInstanceMapper;
    @Autowired
    NodeMapper nodeMapper;
    @Autowired
    CheckMapper checkMapper;
    @Autowired
    ServiceTagMapper serviceTagMapper;

    @Override
    public List<com.ecwid.consul.v1.health.model.HealthService> getHealthServices(String service) {
        List<com.ecwid.consul.v1.health.model.HealthService> list = new ArrayList<>();
        List<ServiceInstance> serviceInstances = serviceInstanceMapper.selectByServiceName(service);
        for(ServiceInstance serviceInstance: serviceInstances){
            com.ecwid.consul.v1.health.model.HealthService healthService = new com.ecwid.consul.v1.health.model.HealthService();
            com.ecwid.consul.v1.health.model.HealthService.Service serviceVO = new com.ecwid.consul.v1.health.model.HealthService.Service();
            com.ecwid.consul.v1.health.model.HealthService.Node nodeVO = new com.ecwid.consul.v1.health.model.HealthService.Node();
            List<Check> checks =new ArrayList<>();
            //设置serviceVO
            BeanUtils.copyProperties(serviceInstance,serviceVO);
            serviceVO.setId(serviceInstance.getServiceInstanceId());
            serviceVO.setTags(serviceTagMapper.selectByServiceId(serviceInstance.getServiceInstanceId()));

            //设置nodeVO
            Node node = nodeMapper.selectByAddress(serviceInstance.getAddress());
            if(node!=null) {
                BeanUtils.copyProperties(node, nodeVO);
                nodeVO.setId(node.getNodeId());
                nodeVO.setNode(node.getName());
            }
            //设置checks
            List<com.yealink.entities.Check> checkList = checkMapper.selectByServiceId(serviceInstance.getServiceInstanceId());
            for(com.yealink.entities.Check checkFromDB: checkList){
                Check check = new Check();
                BeanUtils.copyProperties(checkFromDB,check);
                checks.add(check);
            }


            //放入healthService
            healthService.setService(serviceVO);
            healthService.setNode(nodeVO);
            healthService.setChecks(checks);
            list.add(healthService);
        }
        return list;
    }
}
