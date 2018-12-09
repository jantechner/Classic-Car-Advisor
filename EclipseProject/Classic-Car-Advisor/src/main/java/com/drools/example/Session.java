package com.drools.example;

import com.drools.example.controllers.QuestionViewController;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Session {

    public static KieSession session;

    static void init() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        Session.session = kContainer.newKieSession("ksession-rules");
    }

    public static void insertController(QuestionViewController questionViewController){
        session.insert(questionViewController);
    }

    public static void insertAnswer(UserAnswer answer){
        session.insert(answer);
        session.fireAllRules();
    }

    public static void resetSession(){
        session.destroy();
        init();
    }

}
