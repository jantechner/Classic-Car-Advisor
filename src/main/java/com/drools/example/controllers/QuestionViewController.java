package com.drools.example.controllers;

import com.drools.example.Question;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class QuestionViewController {

    private Question question;

//    public QuestionViewController(Question question) {
//        this.question = question;
//    }

    @FXML
    private Label questionContent;

    @FXML
    private VBox answerBox, resultBox;

//    @FXML
//    public void initialize() {
//        questionContent.setText(question.content);
//    }

    @FXML
    public void userAnswer(ActionEvent event) {

    }

}
