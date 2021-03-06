package com.example.spring.framework.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: 王俊超
 * Date: 2017-07-11 07:19
 * All Rights Reserved !!!
 */
public class JSR250WayService {
    @PostConstruct //1
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy //2
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }

}
