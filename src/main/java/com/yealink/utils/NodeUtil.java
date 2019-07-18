package com.yealink.utils;

import com.yealink.entities.Node;

import java.util.List;

public class NodeUtil  {
    public static   Node[] nodeListToArray(List<Node> list) {
        Node[] nodes = new Node[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nodes[i] = list.get(i);
        }
        return nodes;
    }
}
