package com.example.spring_concepts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring_concepts.impl.CloudEngineer;
import com.example.spring_concepts.impl.DevopsEngineer;
import com.example.spring_concepts.impl.Thbs;

@Configuration
public class AppConfig {

    @Bean
    public Thbs thbs(){
        return new Thbs();
    }

    @Bean
    public DevopsEngineer devopsEngineer(){
        return new DevopsEngineer(thbs());
    }

    @Bean
    public CloudEngineer cloudEngineer(){
        return new CloudEngineer();
    }
}
