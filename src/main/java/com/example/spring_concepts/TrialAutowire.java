package com.example.spring_concepts;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring_concepts.impl.CloudEngineer;

public class TrialAutowire {
    @Autowired
    private CloudEngineer cloudEngineer;
    

    String getDetails(){
        return this.cloudEngineer.toString();
    }

}
