package com.drools.example.controllers;

import com.drools.example.Question;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;


public class QuestionViewController {

    private static Question question;

    @FXML
    Label questionContent;

    @FXML
    private static VBox answerBox, resultBox;

    @FXML
    private static AnchorPane pane;



    public QuestionViewController(){
        System.out.println("controller called");
    }

    @FXML
    public void initialize(){
        System.out.println("initialize called");
        questionContent.setText("testText");
    }

    public void updateLabel(Question q){
        questionContent.setText(q.content);
    }





//    public static void setPane(AnchorPane pane) {
//        QuestionViewController.pane = pane;
//        System.out.println(pane.toString());
//    }

//    public static void updateQuestion(Question q) {
//        question = q;
//        System.out.println("update called");
////        questionContent.setText("testText");
//        System.out.println("static question content: " + question.content);
//    }

    @FXML
    public void userAnswer(ActionEvent event) {

    }

}
