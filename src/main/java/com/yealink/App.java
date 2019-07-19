package com.yealink;

import com.ecwid.consul.v1.agent.model.Check;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.yealink.dao")
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        /**
        ApplicationHome home = new ApplicationHome(App.class);
        File jarFile = home.getSource();
        String jarFileParent = jarFile.getParent(); //jar包运行目录

        //node-id文件用于存放节点id
        File nodeID = new File(jarFileParent+"\\data\\node-id");
        //如果node-id
        if(!nodeID.exists()) {
            try {
                nodeID.createNewFile();
                FileOutputStream nodeID_os = new FileOutputStream(nodeID);
                byte[] bytes = UUID.randomUUID().toString().getBytes();
                nodeID_os.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }**/

        //Consul client = Consul.builder().build();


    }

    @Bean("scheduledThreadPoolExecutor")
    public ScheduledThreadPoolExecutor getCheckSchedulePool() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);

        return executor;
    }
}
