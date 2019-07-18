package com.yealink.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yealink.entities.Tag;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ServiceVO {
    @JsonProperty("ID")
    private String id;

    @JsonProperty("Service")
    private String service;

    @JsonProperty("Tags")
    private String[] tags;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Port")
    private String port;

}
