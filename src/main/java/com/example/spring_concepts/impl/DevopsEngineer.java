package com.example.spring_concepts.impl;

import com.example.spring_concepts.Employee;

public class DevopsEngineer implements Employee{

    private Thbs thbs;

    public DevopsEngineer(Thbs thbs) {
        this.thbs = thbs;
    }

    @Override
    public String getName() {
        return "Tejaswini Rao";
    }

    @Override
    public String getDesignation() {
        return "Devops Engineer";
    }

    @Override
    public double getExperience() {
        return 1.2;
    }

    @Override
    public String getOrganization() {
        return this.thbs.getCompName();
    }

    @Override
    public String toString() {
        return String.format("********************************\nDevops Engineer:=\nName: %s\nDesignation: %s\nCompany: %s\n********************************",this.getName(),this.getDesignation(),this.getOrganization());
    }
    
}
