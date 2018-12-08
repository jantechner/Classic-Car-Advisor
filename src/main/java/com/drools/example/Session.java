package com.drools.example;

import com.drools.example.controllers.QuestionViewController;
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

//        QuestionViewController questionViewController = new QuestionViewController();
//        session.insert(questionViewController);
    }

    public static void insertController(QuestionViewController questionViewController){
        session.insert(questionViewController);
    }

}
