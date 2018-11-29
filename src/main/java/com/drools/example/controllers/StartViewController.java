package com.drools.example.controllers;

import org.apache.log4j.BasicConfigurator;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class StartViewController {

    public void runAdvisor() {
        System.out.println("Start button pressed");

        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
//        Logger.getLogger(CarAdvisor.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");

        session.fireAllRules();
    }
}
