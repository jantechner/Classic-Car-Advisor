package com.drools.example;

import org.apache.log4j.BasicConfigurator;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Session {

    public static KieSession session;

    static void init() {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        KieContainer kContainer = ks.getKieClasspathContainer();
        Session.session = kContainer.newKieSession("ksession-rules");
    }

}
