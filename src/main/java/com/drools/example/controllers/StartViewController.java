package com.drools.example.controllers;

import com.drools.example.Session;

public class StartViewController {

    public void runAdvisor() {

        System.out.println("Start button pressed");
        Session.session.fireAllRules();

    }
}
