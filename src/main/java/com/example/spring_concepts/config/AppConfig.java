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
        System.out.println("###Thbs bean loaded in container###");
        return new Thbs();
    }

    @Bean
    public DevopsEngineer devopsEngineer(){
        System.out.println("###DevopsEngineer bean loaded in container###");
        return new DevopsEngineer(thbs());
    }

    @Bean
    public CloudEngineer cloudEngineer(){
        System.out.println("###CloudEngineer bean loaded in container###");
        return new CloudEngineer();
    }
}
