package com.yealink.controller;

import com.yealink.entities.Node;
import com.yealink.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private NodeService nodeService;

    @GetMapping("/nodes")
    public Node[] nodes(){
       return nodeService.getAllNodes();
    }

    @GetMapping("/services")
    public Map<String,String[]> services(){

        //TODO
        return null;
    }
}