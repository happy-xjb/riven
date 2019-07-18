package com.yealink.entities;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Node {
    private String id;
    private String node;
    private String address;
    private int health;
}
