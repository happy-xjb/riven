package com.yealink.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.ecwid.consul.v1.agent.model.NewService;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.google.gson.Gson;
import com.yealink.vo.ServiceVO;
import jodd.json.JsonParser;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
@RequestMapping("/v1/agent")
public class AgentController {

    @PutMapping("/service/register")
    public void register(@RequestBody NewService newService){
        System.out.println(newService);
//        String jsonStr = fetchPostByTextPlain(request);
//        System.out.println(jsonStr);
//        Gson gson = new Gson();
//        NewService newService = gson.fromJson(jsonStr, NewService.class);
//        System.out.println(newService.getId());

    }


   /* public static String fetchPostByTextPlain(HttpServletRequest request) {
        try {
            BufferedReader reader = request.getReader();
            char[] buf = new char[512];
            int len = 0;
            StringBuffer contentBuffer = new StringBuffer();
            while ((len = reader.read(buf)) != -1) {
                contentBuffer.append(buf, 0, len);
            }
            return contentBuffer.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }   */
}
