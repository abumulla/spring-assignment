package com.example.spring_concepts.impl;

import com.example.spring_concepts.Company;

public class This implements Company{

    @Override
    public String getCompName() {
        return "Torry Harris Integration Solutions";
    }

    @Override
    public String getType() {
        return "Digital transformation products company";
    }
    
}
