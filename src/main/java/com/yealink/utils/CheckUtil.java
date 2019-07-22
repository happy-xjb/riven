package com.yealink.utils;

import com.ecwid.consul.v1.agent.model.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class CheckUtil {
    @Autowired
    private ScheduledExecutorService scheduledExecutorService;

    public void startCheck(NewService newService){
        NewService.Check check = newService.getCheck();


        scheduledExecutorService.scheduleAtFixedRate(()->{

        },0,10, TimeUnit.SECONDS);
    }
}
