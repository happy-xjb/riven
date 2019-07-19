CREATE TABLE `service_instance` (
`service_instance_id` varchar(128) NOT NULL COMMENT '服务实例ID',
`service` varchar(128) NOT NULL COMMENT '服务名称',
`address` varchar(256) NOT NULL COMMENT '服务实例IP地址',
`port` int NULL,
PRIMARY KEY (`service_instance_id`) 
);
CREATE TABLE `service_tag` (
`service` varchar(128) NOT NULL COMMENT '服务名称',
`value` varchar(128) NOT NULL COMMENT '标签值'
);
CREATE TABLE `service` (
`service` varchar(128) NOT NULL COMMENT '服务名称',
PRIMARY KEY (`service`) 
);
CREATE TABLE `node` (
`node_id` varchar(64) NOT NULL COMMENT '唯一的UUID',
`name` varchar(128) NOT NULL COMMENT '节点名称',
`address` varchar(256) NOT NULL COMMENT '节点IP地址',
PRIMARY KEY (`node_id`) 
);
CREATE TABLE `check` (
`node` varchar(128) NOT NULL COMMENT '检查的节点名称',
`check_id` varchar(256) NOT NULL COMMENT '检查ID，格式为service:服务实例ID',
`name` varchar(256) NULL COMMENT '检查名称 格式为Service \'服务名称\' check',
`status` varchar(16) NULL COMMENT '检查状态，passing,warning,failing',
`notes` varchar(512) NULL COMMENT '笔记，一般为空',
`output` varchar(256) NULL COMMENT '检查输出为可理解的文字，如HTTP GET http://10.83.0.125:9532: 200 OK Output: Apollo',
`service_id` varchar(128) NULL COMMENT '检查的服务ID',
`service_name` varchar(128) NULL COMMENT '检查的服务名称',
PRIMARY KEY (`check_id`) 
);
