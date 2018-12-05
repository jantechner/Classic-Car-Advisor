package com.drools.example.controllers;

import com.drools.example.Session;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class StartViewController {

    @FXML
    private AnchorPane pane;

    public void runAdvisor() {

        System.out.println("Start button pressed");
        Session.session.fireAllRules();

        Stage stage = (Stage) pane.getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/questionView.fxml"));
            pane = loader.load();
            Scene scene = new Scene(pane);
            stage.setScene(scene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
