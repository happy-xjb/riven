package com.yealink.dao;

import com.yealink.entities.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TagDao {
    List<Tag> selectByService(String service);
    List<String> selectValueByService(String service);
}
