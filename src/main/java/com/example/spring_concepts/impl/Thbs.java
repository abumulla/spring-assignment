package com.example.spring_concepts.impl;

import com.example.spring_concepts.Company;

public class Thbs implements Company{

    @Override
    public String getCompName() {
        return "Torry Harris Business Solutions";
    }

    @Override
    public String getType() {
        return "IT consultancy company";
    }
    
}
