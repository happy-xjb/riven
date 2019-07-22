package com.yealink.utils;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TimeUtilTest {

    @Test
    public void getTimeUnit() {
        TimeUnit timeUnit = TimeUtil.getTimeUnit("10s");
        System.out.println(TimeUnit.MILLISECONDS.convert(10,timeUnit));
    }

    @Test
    public void getTimeNum() {
        int timeNum = TimeUtil.getTimeNum("10us");
        System.out.println(timeNum);
    }
}