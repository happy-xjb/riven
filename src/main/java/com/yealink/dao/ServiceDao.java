package com.yealink.dao;

import com.yealink.entities.Service;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ServiceDao {
     Service selectById(String id);
     void insert(Service service);
     List<Service> selectAllHealthyService();
     List<Service> selectAll();
}
