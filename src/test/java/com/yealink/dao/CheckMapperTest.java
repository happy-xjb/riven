package com.yealink.dao;

import com.yealink.entities.Check;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CheckMapperTest {

    @Autowired
    private CheckMapper checkMapper;

    @Test
    public void testCN() {
        Check check = new Check();
        check.setCheckId("test_key1");
        check.setOutput("从v额是");
        checkMapper.insert(check);
    }

}
