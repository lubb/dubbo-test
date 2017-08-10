package com.lbb.dubbo.provider;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PublishServer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "dubbo_provider.xml" });
        System.out.println("启动");
        context.start();
        System.out.println("启动了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
