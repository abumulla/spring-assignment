package com.example.spring_concepts.impl;

import com.example.spring_concepts.Employee;

public class SoftwareTester implements Employee {

    private This this1;

    public SoftwareTester(This this1) {
        this.this1 = this1;
    }

    @Override
    public String getName() {
        return "Rohith Kanugauda";
    }

    @Override
    public String getDesignation() {
        return "Quality Analyst";
    }

    @Override
    public double getExperience() {
        return 1.5;
    }

    @Override
    public String getOrganization() {
        return this.this1.getCompName();
    }
    
    @Override
    public String toString() {
        return String.format("********************************\nSoftware Tester:=\nName: %s\nDesignation: %s\nCompany: %s\n********************************",this.getName(),this.getDesignation(),this.getOrganization());
    }
}
