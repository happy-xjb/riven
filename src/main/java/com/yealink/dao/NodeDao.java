package com.yealink.dao;

import com.yealink.entities.Node;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NodeDao {
    List<Node> selectAll();
}
