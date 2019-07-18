package com.yealink.dao;

import com.yealink.entities.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagDao {
    List<Tag> selectByServiceId(String id);
}
