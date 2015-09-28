package com.softserve.edu;

import com.softserve.edu.config.ServiceConfig;
import com.softserve.edu.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
        System.out.println(context.getBean(PersonService.class).getAll());

    }
}
