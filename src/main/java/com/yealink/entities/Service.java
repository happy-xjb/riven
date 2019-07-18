package com.yealink.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;



@Data
@Accessors(chain = true)
public class Service {
    private String id;

    private String service;


    private String address;

    private String port;

    private int health;

    private String nodeId;
}
