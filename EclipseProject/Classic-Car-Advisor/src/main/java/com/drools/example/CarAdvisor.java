package com.drools.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CarAdvisor extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/startView.fxml"));

        primaryStage.setTitle("Classic car advisor");
        Scene scene = new Scene(root, 1000, 600);
        primaryStage.setScene(scene);

        primaryStage.show();

        Session.init();
    }

    public static void main(String args[]){
        launch(args);
    }

}
