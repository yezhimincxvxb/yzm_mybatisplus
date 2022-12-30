package com.yzm.plus02.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 自定义ID生成器
 */
@Slf4j
@Component
public class CustomIdGenerator implements IdentifierGenerator {

    private final AtomicLong al = new AtomicLong(1);

    /**
     * entity：实体对象
     * nextId：IdType.ASSIGN_ID
     * 主键类型：Long,Integer,String
     */
    @Override
    public Number nextId(Object entity) {

        //可以将当前传入的class全类名来作为bizKey,或者提取参数来生成bizKey进行分布式Id调用生成.
        String bizKey = entity.getClass().getName();
        log.info("bizKey:{}", bizKey);
        MetaObject metaObject = SystemMetaObject.forObject(entity);
        String name = (String) metaObject.getValue("name");
        final long id = al.getAndAdd(1);
        log.info("为{}生成主键值->:{}", name, id);
        return id + 10000;
    }

    /**
     * nextUUID：IdType.ASSIGN_UUID
     * 主键类型：String
     */
    @Override
    public String nextUUID(Object entity) {
        return IdWorker.get32UUID();
    }
}
