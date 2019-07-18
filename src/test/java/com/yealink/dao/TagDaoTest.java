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
    public void selectByServiceId(){
        List<Tag> tags = tagDao.selectByServiceId("1");
        String[] stringArray = TagUtil.tagListToStringArray(tags);
        System.out.println(stringArray[0]);
        assertEquals(2,tags.size());
    }
}