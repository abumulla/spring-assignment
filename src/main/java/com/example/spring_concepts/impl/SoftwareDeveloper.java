package com.example.spring_concepts.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.spring_concepts.Employee;

public class SoftwareDeveloper implements Employee{

    private This this1;

    @Override
    public String getName() {
        return "Abubakar M";
    }

    @Override
    public String getDesignation() {
        return "Associate Software Engineer";
    }

    @Override
    public double getExperience() {
        return 0.8;
    }

    @Override
    public String getOrganization(){
        return this.this1.getCompName();
    }

    // Setter Injection using XML based config
    @Autowired
    public void setThis1(This this1) {
        this.this1 = this1;
    }
    
    @Override
    public String toString() {
        return String.format("********************************\nSoftware Developer:=\nName: %s\nDesignation: %s\nCompany: %s\n********************************",this.getName(),this.getDesignation(),this.getOrganization());
    }
}
