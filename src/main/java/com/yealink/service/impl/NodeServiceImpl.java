package com.yealink.service.impl;

import com.yealink.dao.NodeDao;
import com.yealink.entities.Node;
import com.yealink.service.NodeService;
import com.yealink.utils.NodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeServiceImpl implements NodeService {
    @Autowired
    private NodeDao nodeDao;

    @Override
    public Node[] getAllNodes() {
        List<Node> nodes = nodeDao.selectAll();
        Node[] array = NodeUtil.nodeListToArray(nodes);
        return array;
    }
}
