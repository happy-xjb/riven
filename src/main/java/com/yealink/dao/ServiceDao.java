package com.yealink.dao;

import com.yealink.entities.Service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ServiceDao {
     Service selectById(String id);     //根据ID查找服务实体
     void insert(Service service); //插入服务实体
     List<Service> selectAllHealthyService();     //返回所有健康状态的服务实体
     List<Service> selectAll();    //返回所有服务实体
     List<String> selectAllServiceName();    //返回服务名称列表
}
