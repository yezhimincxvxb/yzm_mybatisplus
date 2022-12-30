CREATE TABLE `goods` (
     `id` varchar(50),
     `name` varchar(20) NOT NULL DEFAULT '' COMMENT '商品名',
     `price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
     `left_num` int DEFAULT '0' COMMENT '库存',
     `status` char(2) DEFAULT '0' COMMENT '状态[0-下架,1-上架,2-热销]',
     `version` int DEFAULT '0' COMMENT '版本',
     `update_date` datetime DEFAULT NULL COMMENT '更新时间',
     `create_date` datetime DEFAULT NULL COMMENT '创建时间',
     `deleted` tinyint DEFAULT '0' COMMENT '删除状态[0-未删1-已删]',
     `date_unix` varchar(30) DEFAULT NULL COMMENT '创建时间戳',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='商品表';