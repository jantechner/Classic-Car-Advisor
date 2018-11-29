package com.drools.example;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;

public class CarAdvisor extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
      /*
      Code for JavaFX application.
      (Stage, scene, scene graph)
      */
//        Parent root = FXMLLoader.load(getClass().getResource("com/drools/example/fxml/startView.fxml"));
//
//        primaryStage.setTitle("Symulator Gieldy");
//        Scene scene = new Scene(root, 1000, 1000);
//        primaryStage.setScene(scene);
//
//        primaryStage.show();
    }

    public static void main(String args[]){
//        launch(args);

        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
//        Logger.getLogger(CarAdvisor.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");

        session.fireAllRules();
    }

}
