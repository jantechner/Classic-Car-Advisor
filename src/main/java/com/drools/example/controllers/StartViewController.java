package com.drools.example.controllers;

import com.drools.example.Session;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class StartViewController {

    @FXML
    private AnchorPane pane;

    public void runAdvisor() {
        System.out.println("Start button pressed");

        Stage stage = (Stage) pane.getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/questionView.fxml"));
            Scene scene = new Scene(loader.load());

            Session.insertController(loader.getController());

            stage.setScene(scene);
            Session.session.fireAllRules();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
