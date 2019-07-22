package com.yealink.utils;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TimeUtilTest {

    @Test
    public void getTimeUnit() {
        TimeUnit timeUnit = TimeUtil.getTimeUnit("10us");
        System.out.println(timeUnit);
    }

    @Test
    public void getTimeNum() {
        int timeNum = TimeUtil.getTimeNum("10us");
        System.out.println(timeNum);
    }
}