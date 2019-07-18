package com.yealink.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;



@Data
@Accessors(chain = true)
public class Service {
    @JsonProperty("ID")
    private String id;

    @JsonProperty("ServiceVO")
    private String service;


    @JsonProperty("Address")
    private String address;

    @JsonProperty("Port")
    private String port;

    @JsonIgnore
    private int health;

    @JsonIgnore
    private String nodeId;
}
