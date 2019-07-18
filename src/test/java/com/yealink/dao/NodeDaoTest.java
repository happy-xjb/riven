package com.yealink.dao;

import com.yealink.entities.Node;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NodeDaoTest {
    @Autowired
    NodeDao nodeDao;

    @Test
    public void selectAll(){
        List<Node> nodes = nodeDao.selectAll();
        System.out.println(nodes);
    }
}