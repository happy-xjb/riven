package com.yealink.dao;

import com.yealink.entities.Tag;
import com.yealink.utils.TagUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TagDaoTest {
    @Autowired
    private TagDao tagDao;

    @Test
    public void selectByService(){
        List<Tag> tags = tagDao.selectByService("redis");
        System.out.println(tags);
    }

    @Test
    public void selectValueByService(){
        List<String> list = tagDao.selectValueByService("redis");
        System.out.println(list);
    }
}