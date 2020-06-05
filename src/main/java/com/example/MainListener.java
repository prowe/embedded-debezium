package com.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MainListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    	System.out.println("Up");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    	System.out.println("Destroyed");    	
    }
}