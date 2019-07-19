package com.yealink.check.service;

import org.apache.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class CheckService {

    @Autowired
    private ScheduledThreadPoolExecutor executor;

    public void registSchedule(String str) {
        executor.schedule(() -> {

        }, 15, TimeUnit.SECONDS);

    }



}
