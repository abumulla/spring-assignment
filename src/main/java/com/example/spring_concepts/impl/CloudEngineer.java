package com.example.spring_concepts.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring_concepts.Employee;

public class CloudEngineer implements Employee{

    private Thbs thbs;

    @Override
    public String getName() {
        return "Tarun M";
    }

    @Override
    public String getDesignation() {
        return "Cloud Architect";
    }

    @Override
    public double getExperience() {
        return 1.3;
    }

    @Override
    public String getOrganization() {
        return this.thbs.getCompName();
    }

    @Autowired
    public void setThbs(Thbs thbs) {
        this.thbs = thbs;
    }

    @Override
    public String toString() {
        return String.format("********************************\nCloud Engineer:=\nName: %s\nDesignation: %s\nCompany: %s\n********************************",this.getName(),this.getDesignation(),this.getOrganization());
    }
    
}
