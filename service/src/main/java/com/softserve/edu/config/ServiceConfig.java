package com.softserve.edu.config;

import config.PersistanceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.softserve.edu.service")
@Import(PersistanceConfig.class)
public class ServiceConfig {
}
